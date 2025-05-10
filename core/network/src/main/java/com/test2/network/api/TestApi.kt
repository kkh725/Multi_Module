package com.test2.network.api

import com.test2.network.model.TestDataClass
import retrofit2.Response
import retrofit2.http.GET


interface TestApi {
    @GET("/posts")
    suspend fun getPosts(): Response<List<TestDataClass>>
}


