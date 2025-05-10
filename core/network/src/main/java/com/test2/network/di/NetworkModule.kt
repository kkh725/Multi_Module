package com.test2.network.di

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
    fun provideJsonPlaceholderApi(@TestApi retrofit: Retrofit): TestApi {
        return retrofit.create(TestApi::class.java)
    }

    @Provides
    @Singleton
    fun provideAnotherApi(@TestApi2 retrofit: Retrofit): TestApi2 {
        return retrofit.create(TestApi2::class.java)
    }

}


