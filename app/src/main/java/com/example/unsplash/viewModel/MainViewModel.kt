package com.example.unsplash.viewModel

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.unsplash.networking.data.ItemsRepository
import com.example.unsplash.networking.items.PhotoItem
import com.example.unsplash.networking.items.LoadingItem
import kotlinx.coroutines.Job
import kotlinx.coroutines.launch
import timber.log.Timber

class MainViewModel: ViewModel() {

    private val repository = ItemsRepository()

    private val photosListMutableLiveData = MutableLiveData<MutableList<Any?>>()
    private val changePhotosMutableLiveData = MutableLiveData<List<Int>>()
    private val isLoadingLiveData = MutableLiveData<Boolean>()

    private var currentSearchJob: Job? = null

    val changePhotosLiveData: LiveData<List<Int>>
        get() = changePhotosMutableLiveData

    val photosLiveData: LiveData<MutableList<Any?>>
        get() = photosListMutableLiveData

    val isLoading: LiveData<Boolean>
        get() = isLoadingLiveData

    init {
        getNewItems(1)
    }

    fun likePhoto(photoItem: PhotoItem) {
        isLoadingLiveData.postValue(true)
        currentSearchJob?.cancel()
        currentSearchJob = viewModelScope.launch {
            runCatching {
                repository.likePhoto(photoItem = photoItem)
            }.onSuccess {
                val changedItemIndex = photosLiveData.value?.indexOf(photoItem)!!
                photosLiveData.value?.set(changedItemIndex, it)
                changePhotosMutableLiveData.postValue(listOf(changedItemIndex, it.likes))
            }.onFailure {
                Timber.e(it)
            }
        }
    }

    fun getNewItems(pageNumber: Int) {

        var newItems = photosListMutableLiveData.value ?: emptyList<Any?>().toMutableList()

        newItems = newItems.toMutableList().apply {
            if (lastOrNull() is LoadingItem) removeLastOrNull()
        }

        if (pageNumber > 5) {
            isLoadingLiveData.postValue(true)
            photosListMutableLiveData.postValue(newItems)
            return
        }

        currentSearchJob?.cancel()
        currentSearchJob = viewModelScope.launch {
            runCatching {
                repository.getPhotosList(pageNumber = pageNumber)
            }.onSuccess {
                photosListMutableLiveData.postValue((newItems + it + LoadingItem()).toMutableList())
            }.onFailure {
                Timber.e(it)
                photosListMutableLiveData.postValue(emptyList<Any?>().toMutableList())
            }
        }
    }
}