package com.example.unsplash.networking.items

data class PhotoItem(
    val id: String,
    val username: String,
    val avatar: String,
    val imageUrl: String,
    val likes: Int,
    var likedByUser: Boolean
)