package com.example.android.dagger.repository.datasource.database

import com.example.android.dagger.entity.Photos

interface PexelsDatabaseDataSource {

    fun insertImages(photos: List<Photos>)

    fun findAllImages() : List<Photos>
}