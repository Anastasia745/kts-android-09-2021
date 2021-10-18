package com.example.unsplash.networking.data

import retrofit2.http.GET
import retrofit2.http.Query
import com.example.unsplash.networking.data.models_.Photo
import com.example.unsplash.networking.data.models_.ServerItemsWrapper

interface UnsplashApi {
    @GET("photos")
    suspend fun searchUsers(
        @Query("page") page: Int
    ): ServerItemsWrapper<Photo>
}
