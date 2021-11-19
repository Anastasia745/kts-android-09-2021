package com.example.unsplash.networking.data

import com.example.unsplash.networking.items.CollectionItem
import com.example.unsplash.networking.items.PhotoItem

class ItemsRepository {

    suspend fun getPhotosList(pageNumber: Int): List<PhotoItem?> {
        return Networking.unsplashApi.getPhotosList(pageNumber).map {
            PhotoItem(
                id = it.id,
                username = it.user.userName,
                imageUrl = it.urls.full,
                avatar = it.user.profileImage.medium!!,
                likes = it.likes,
                likedByUser = it.likedByUser
            )
        }
    }

    suspend fun getCollectionsList(pageNumber: Int): List<CollectionItem?> {
        return Networking.unsplashApi.getCollectionsList(pageNumber).map {
            CollectionItem(
                id = it.id,
                avatar = it.cover_photo.user.profile_image.medium,
                username = it.cover_photo.user.username,
                raw = it.cover_photo.urls.raw
            )
        }
    }

    suspend fun likePhoto(photoItem: PhotoItem): PhotoItem {
        val one = Networking.unsplashApi.getPhoto(photoItem.id)
        if(!one.likedByUser) {
            val photo = Networking.unsplashApi.likePhoto(photoItem.id).photo
            return PhotoItem(
                id = photo.id,
                username = photo.user.userName,
                imageUrl = photo.urls.full,
                avatar = photo.user.profileImage.medium!!,
                likes = photo.likes,
                likedByUser = photo.likedByUser
            )
        }
        else
        {
            val photo = Networking.unsplashApi.unlikePhoto(photoItem.id).photo
            return PhotoItem(
                id = photo.id,
                username = photo.user.userName,
                imageUrl = photo.urls.full,
                avatar = photo.user.profileImage.medium!!,
                likes = photo.likes,
                likedByUser = photo.likedByUser
            )
        }
    }

}