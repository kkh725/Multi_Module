package com.test2.data.di

import com.test2.data.repository.TestRepository
import com.test2.data.repository.TestRepositoryImpl
import com.test2.datastore.datasource.LocalDataSource
import com.test2.network.datasource.TestDataSource
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
object DataModule {

    @Provides
    @Singleton
    fun provideTestRepository(
        localDataSource: LocalDataSource,
        testDataSource: TestDataSource
    ): TestRepository {
        return TestRepositoryImpl(localDataSource, testDataSource)
    }

}