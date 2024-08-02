package com.example.android.dagger.repository.datasource.network

import com.example.android.dagger.repository.datasource.network.PexelsAPIService
import com.example.android.dagger.repository.datasource.network.PexelsNetworkDataSource
import javax.inject.Inject

class PexelsNetworkDataSourceImpl @Inject constructor(val pexelsAPIService : PexelsAPIService) :
    PexelsNetworkDataSource {

    override fun getImages() = pexelsAPIService.getImages().execute().body()

}