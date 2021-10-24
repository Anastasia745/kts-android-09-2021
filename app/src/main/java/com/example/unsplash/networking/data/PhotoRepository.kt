package com.example.unsplash.networking.data

import android.util.Patterns
import com.example.unsplash.networking.data.db.Database
import com.example.unsplash.networking.data.models.Photo

class PhotoRepository {

    private val userDao = Database.instance.photoDao()

    suspend fun savePhoto(photo: Photo) {
        if(isPhotoValid(photo).not()) throw IncorrectFormException()
        userDao.insertPhotos(listOf(photo))
    }

    suspend fun updatePhoto(photo: Photo) {
        if(isPhotoValid(photo).not()) throw IncorrectFormException()
        userDao.updatePhoto(photo)
    }

    private fun isPhotoValid(photo: Photo): Boolean {
        return photo.alt_description.isNotBlank() &&
            Patterns.EMAIL_ADDRESS.matcher(photo.alt_description).matches()
    }

}
