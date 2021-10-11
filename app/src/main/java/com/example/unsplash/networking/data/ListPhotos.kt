package com.example.unsplash.networking.data

import com.example.unsplash.networking.data.models.Photo

class ListPhotos {

    suspend fun getListPhotos(
        page: Int,
    ): List<Photo> {
        return Networking.unsplashApi.searchUsers(page).items
    }
}
