package com.example.unsplash.networking.data

import com.example.unsplash.networking.data.UnsplashApi
import okhttp3.OkHttpClient
import okhttp3.logging.HttpLoggingInterceptor
import retrofit2.Retrofit
import retrofit2.converter.moshi.MoshiConverterFactory
import retrofit2.create
import timber.log.Timber

object Networking {

    private val okhttpClient = OkHttpClient.Builder()
        .addNetworkInterceptor(
            HttpLoggingInterceptor {
                Timber.tag("Network").d(it)
                val interceptor = HttpLoggingInterceptor()
                val builder = OkHttpClient.Builder()
                if (Auth.token != null) {
                    builder.addInterceptor(interceptor)
                        .followRedirects(true)
                        .followSslRedirects(true)
                        .addInterceptor { chain ->
                            val original = chain.request()
                            val request = original.newBuilder()
                                .header("Authorization", "Bearer ${Auth.token!!}")
                                .build()

                            chain.proceed(request)
                        }
                }
            }.setLevel(HttpLoggingInterceptor.Level.BODY)
        )
        .build()

    private val retrofit = Retrofit.Builder()
        .baseUrl("https://api.unsplash.com/")
        .addConverterFactory(MoshiConverterFactory.create())
        .client(okhttpClient)
        .build()

    val unsplashApi: UnsplashApi
        get() = retrofit.create()

}
