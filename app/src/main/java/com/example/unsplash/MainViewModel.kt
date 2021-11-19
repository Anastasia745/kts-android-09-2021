package com.example.unsplash

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.unsplash.networking.data.ListPhotos
import com.example.unsplash.networking.data.models.Photo
import kotlinx.coroutines.Job
import kotlinx.coroutines.launch
import timber.log.Timber

class MainViewModel: ViewModel() {

    private val repository = ListPhotos()

    private val userListLiveData = MutableLiveData<List<Photo>>(emptyList())
    private val isLoadingLiveData = MutableLiveData(false)

    private var currentSearchJob: Job? = null

    val userList: LiveData<List<Photo>>
        get() = userListLiveData

    val isLoading: LiveData<Boolean>
        get() = isLoadingLiveData

    fun search(page: Int) {
        isLoadingLiveData.postValue(true)
        currentSearchJob?.cancel()
        currentSearchJob = viewModelScope.launch {
            runCatching {
                repository.getListPhotos(page)
            }.onSuccess {
                isLoadingLiveData.postValue(false)
                userListLiveData.postValue(it)
            }.onFailure {
                Timber.e(it)
                isLoadingLiveData.postValue(false)
                userListLiveData.postValue(emptyList())
            }
        }
    }
}