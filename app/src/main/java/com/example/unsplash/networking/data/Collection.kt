package com.example.unsplash.networking.data

import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class Collection(
    val id: String,
    val cover_photo: CoverPhoto
)

@JsonClass(generateAdapter = true)
data class CoverPhoto(
    val id: String,
    val user: User,
    val urls: UrlsCollections
)

@JsonClass(generateAdapter = true)
data class User(
    val id: String,
    val username: String,
    val profile_image: ProfileImageCollection
)

@JsonClass(generateAdapter = true)
data class ProfileImageCollection(
    val medium: String
)

@JsonClass(generateAdapter = true)
data class UrlsCollections(
    val raw: String
)
