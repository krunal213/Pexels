package com.example.android.dagger.di.module

import com.example.android.dagger.repository.datasource.network.PexelsAPIService
import dagger.Module
import dagger.Provides
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import javax.inject.Singleton

@Module
object NetworkModule {

    @Provides
    @Singleton
    fun provideGsonConverterFactory() = GsonConverterFactory.create()

    @Provides
    @Singleton
    fun provideRetrofit(gsonConverterFactory: GsonConverterFactory) = Retrofit.Builder()
        .baseUrl("https://api.pexels.com/")
        .addConverterFactory(gsonConverterFactory)
        .build()

    @Provides
    @Singleton
    fun providePexelsAPIService(retrofit: Retrofit) = retrofit.create(PexelsAPIService::class.java)

}