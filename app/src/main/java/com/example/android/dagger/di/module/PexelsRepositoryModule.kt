package com.example.android.dagger.di.module

import com.example.android.dagger.repository.PexelsRepository
import com.example.android.dagger.repository.PexelsRepositoryImpl
import dagger.Binds
import dagger.Module

@Module
abstract class PexelsRepositoryModule {

    @Binds
    abstract fun bindsPexelsRepository(pexelsRepositoryImpl: PexelsRepositoryImpl) : PexelsRepository
}