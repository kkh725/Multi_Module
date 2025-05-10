package com.test2.network.api

import com.test2.network.model.TestDataClass
import retrofit2.http.GET


interface TestApi2 {
    @GET("/posts")
    suspend fun getPosts(): List<TestDataClass>
}