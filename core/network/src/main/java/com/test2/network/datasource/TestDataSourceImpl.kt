package com.test2.network.datasource

import com.test2.network.api.TestApi
import com.test2.network.model.TestDataClass
import jakarta.inject.Inject
import retrofit2.Response

class TestDataSourceImpl @Inject constructor(private val testApi: TestApi) : TestDataSource {
    override suspend fun testPosts(): Response<List<TestDataClass>> {
        return testApi.getPosts()
    }
}