package com.example.unsplash.networking.data.models_

import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class Photo(
    @Json(name = "id")
    val id: String,
    @Json(name = "alt_description")
    val alt_description: String,
    val urls: String,
    @Json(name = "likes")
    val likes: Int,
    @Json(name = "liked_by_user")
    val likedByUser: Boolean
)

/*data class Urls(
    @Json(name = "raw")
    val raw: String
)*/