package com.example.android.dagger.repository.datasource.network

import com.example.android.dagger.entity.PexelsResponse

interface PexelsNetworkDataSource {

    fun getImages() : PexelsResponse?
}