package com.test2.data

import okhttp3.MediaType.Companion.toMediaType
import okhttp3.OkHttpClient
import okhttp3.logging.HttpLoggingInterceptor
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import retrofit2.http.GET


data class Post(
    val userId: Int,
    val id: Int,
    val title: String,
    val body: String
)

interface JsonPlaceholderApi {
    @GET("/posts")
    suspend fun getPosts(): List<Post>
}

class RetrofitBuilder(){

    val contentType = "application/json".toMediaType()

    val retrofit: Retrofit = Retrofit.Builder()
        .baseUrl("https://jsonplaceholder.typicode.com")
        .addConverterFactory(GsonConverterFactory.create())
        .client(
            OkHttpClient.Builder()
                .addInterceptor(HttpLoggingInterceptor().apply {
                    level = HttpLoggingInterceptor.Level.BODY
                }).build()
        )
        .build()

    val api = retrofit.create(JsonPlaceholderApi::class.java)
}
