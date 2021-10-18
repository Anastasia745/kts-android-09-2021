package com.example.unsplash.networking.data

import com.example.unsplash.networking.data.UnsplashApi
import okhttp3.Interceptor
import okhttp3.OkHttpClient
import okhttp3.logging.HttpLoggingInterceptor
import retrofit2.Retrofit
import retrofit2.converter.moshi.MoshiConverterFactory
import retrofit2.create
import timber.log.Timber

object Networking {

    private var okhttpClient: OkHttpClient =
        OkHttpClient.Builder().addInterceptor(Interceptor { chain ->
            val original = chain.request()
            val builder = original.newBuilder()

            if (Auth.token != null) {
                builder
                    .header("Authorization", "Bearer ${Auth.token}")
                    .method(original.method, original.body)
            }

            chain.proceed(builder.build())
        }).addNetworkInterceptor(
            HttpLoggingInterceptor {
                Timber.tag("Network").d(it)
            }.setLevel(HttpLoggingInterceptor.Level.BODY)
        ).build()

    private val retrofit = Retrofit.Builder()
        .baseUrl("https://api.unsplash.com/")
        .addConverterFactory(MoshiConverterFactory.create())
        .client(okhttpClient)
        .build()

    val unsplashApi: UnsplashApi
        get() = retrofit.create()

}
