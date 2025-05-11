package com.test2.network.di

import com.test2.network.datasource.TestDataSource
import com.test2.network.datasource.TestDataSourceImpl
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import retrofit2.Retrofit
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
object NetworkModule {

    @Provides
    @Singleton
    internal fun provideTestApi(@TestApi retrofit: Retrofit): TestApi {
        return retrofit.create(TestApi::class.java)
    }

    @Provides
    @Singleton
    internal fun provideTestApi2(@TestApi2 retrofit: Retrofit): TestApi2 {
        return retrofit.create(TestApi2::class.java)
    }

    //최종적으로 TestDataSource 만 공개함.
    @Provides
    @Singleton
    fun provideTestDataSource(testApi: com.test2.network.api.TestApi) : TestDataSource{
        return TestDataSourceImpl(testApi)
    }

}


