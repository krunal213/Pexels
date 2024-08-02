package com.example.android.dagger.di.module

import com.example.android.dagger.repository.datasource.database.PexelsDatabaseDataSource
import com.example.android.dagger.repository.datasource.database.PexelsDatabaseDataSourceImpl
import com.example.android.dagger.repository.datasource.network.PexelsNetworkDataSource
import com.example.android.dagger.repository.datasource.network.PexelsNetworkDataSourceImpl
import dagger.Binds
import dagger.Module

@Module
abstract class DataSourceModule {

    @Binds
    abstract fun bindsPexelsNetworkDataSource(pexelsNetworkDataSourceImpl: PexelsNetworkDataSourceImpl) : PexelsNetworkDataSource

    @Binds
    abstract fun bindsPexelsDatabaseDataSource(pexelsDatabaseDataSourceImpl: PexelsDatabaseDataSourceImpl) : PexelsDatabaseDataSource
}