package com.example.unsplash.networking.data


import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class Photo(
    val id: String,
    val urls: Urls,
    val user: UserInfoFromPhoto,
    val likes: Int,
    @Json(name = "liked_by_user")
    val likedByUser: Boolean
)

@JsonClass(generateAdapter = true)
data class Urls(
    val full: String
)

@JsonClass(generateAdapter = true)
data class ProfileImage(
    var small: String?,
    var medium: String?,
    var large: String?
)

@JsonClass(generateAdapter = true)
data class PhotoResponse(
    val photo: Photo
)

@JsonClass(generateAdapter = true)
data class UserInfoFromPhoto(
    @Json(name = "username")
    val userName: String,
    @Json(name = "profile_image")
    val profileImage: ProfileImage
)