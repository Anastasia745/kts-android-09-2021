package com.example.unsplash

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.unsplash.networking.data.IncorrectFormException
import com.example.unsplash.networking.data.ListPhotos
import com.example.unsplash.networking.data.PhotoRepository

import com.example.unsplash.networking.data.models.Urls
import kotlinx.coroutines.Job
import kotlinx.coroutines.channels.Channel
import kotlinx.coroutines.launch
import timber.log.Timber

class MainViewModel: ViewModel() {

    private val repository = ListPhotos()
    private val photoRepository = PhotoRepository()
    private val saveError = Channel<Int>(Channel.BUFFERED)
    private val saveSuccess = Channel<Unit>(Channel.BUFFERED)

    private val userListLiveData = MutableLiveData<List<com.example.unsplash.networking.data.models_.Photo>>(emptyList())
    private val isLoadingLiveData = MutableLiveData(false)

    private var currentSearchJob: Job? = null

    val photoList: LiveData<List<com.example.unsplash.networking.data.models_.Photo>>
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

    fun save(
        id: Long,
        //photo_id: Long,
        alt_description: String,
        urls: Urls,
        raw: String,
        likes: Int,
        liked_by_user: Boolean
    ) {

        val photo = com.example.unsplash.networking.data.models.Photo(
            id = id,
            //photo_id = photo_id,
            alt_description = alt_description,
            urls = urls,
            raw = raw,
            likes = likes,
            liked_by_user = liked_by_user
        )

        viewModelScope.launch {
            try {
                if (id == 0L) {
                    photoRepository.savePhoto(photo)
                } else {
                    photoRepository.updatePhoto(photo)
                }
                saveSuccess.send(Unit)
            } catch (t: Throwable) {
                Timber.e(t, "user save error")
                showError(t)
            }
        }
    }

    private suspend fun showError(t: Throwable) {
        saveError.send(
            when (t) {
                is IncorrectFormException -> R.string.user_add_error_incorrect_format
                else -> R.string.user_add_error_default
            }
        )
    }
}