package com.test2.data.repository

interface TestRepository {
    suspend fun localDoit()
    suspend fun networkDoit()
}