package com.example.unsplash.networking.data

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.unsplash.networking.items.LoadingItem
import kotlinx.coroutines.Job
import kotlinx.coroutines.launch
import timber.log.Timber

class CollectionViewModel: ViewModel() {

    private val repository = ItemsRepository()

    private val collectionsListMutableLiveData = MutableLiveData<MutableList<Any?>>()
    private val changeCollectionsMutableLiveData = MutableLiveData<List<Int>>()
    private val isLoadingLiveData = MutableLiveData<Boolean>()

    private var currentSearchJob: Job? = null

    val changeCollectionsLiveData: LiveData<List<Int>>
        get() = changeCollectionsMutableLiveData

    val collectionsLiveData: LiveData<MutableList<Any?>>
        get() = collectionsListMutableLiveData

    val isLoading: LiveData<Boolean>
        get() = isLoadingLiveData

    init {
        getNewCollections(1)
    }

    fun getNewCollections(pageNumber: Int) {

        var newItems = collectionsListMutableLiveData.value ?: emptyList<Any?>().toMutableList()

        newItems = newItems.toMutableList().apply {
            if (lastOrNull() is LoadingItem) removeLastOrNull()
        }


        currentSearchJob?.cancel()
        currentSearchJob = viewModelScope.launch {
            runCatching {
                repository.getCollectionsList(pageNumber = pageNumber)
            }.onSuccess {
                collectionsListMutableLiveData.postValue((newItems + it + LoadingItem()).toMutableList())
            }.onFailure {
                Timber.e(it)
                collectionsListMutableLiveData.postValue(emptyList<Any?>().toMutableList())
            }
        }
    }
}