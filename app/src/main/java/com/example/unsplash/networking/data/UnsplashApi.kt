package com.example.unsplash.networking.data

import retrofit2.http.*

interface UnsplashApi {
    @GET("photos")
    suspend fun getPhotosList(
        @Query("page") pageNumber: Int
    ): List<Photo>

    @GET("photos/{id}")
    suspend fun getPhoto(
        //@Query("page") pageNumber: Int,
        @Path("id") id: String
    ): Photo

    @POST("photos/{id}/like")
    suspend fun likePhoto(
        @Path("id") id: String
    ): PhotoResponse

    @DELETE("photos/{id}/like")
    suspend fun unlikePhoto(
        @Path("id") id: String
    ): PhotoResponse

    @GET("collections")
    suspend fun getCollectionsList(
        @Query("page") pageNumber: Int
    ): List<Collection>
}
