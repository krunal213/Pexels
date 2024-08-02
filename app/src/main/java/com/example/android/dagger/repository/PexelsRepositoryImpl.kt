package com.example.android.dagger.repository

import com.example.android.dagger.entity.Photos
import com.example.android.dagger.repository.datasource.database.PexelsDatabaseDataSource
import com.example.android.dagger.repository.datasource.network.PexelsNetworkDataSource
import javax.inject.Inject

class PexelsRepositoryImpl @Inject constructor(
    val pexelsNetworkDataSource: PexelsNetworkDataSource,
    val pexelsDatabaseDataSource: PexelsDatabaseDataSource
) : PexelsRepository {

    override fun getImages(): List<Photos>? = try {
        pexelsNetworkDataSource.getImages()?.photos?.let {
            pexelsDatabaseDataSource.insertImages(
                it
            )
        }
        pexelsDatabaseDataSource.findAllImages()
    } catch (ex: Exception) {
        pexelsDatabaseDataSource.findAllImages()
    }
}

