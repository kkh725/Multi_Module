package com.test2.network.datasource

import com.test2.network.di.TestApi
import com.test2.network.model.TestDataClass
import jakarta.inject.Inject
import retrofit2.Response

interface TestDataSource {
    suspend fun testPosts() : Response<List<TestDataClass>>
}