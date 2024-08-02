package com.example.android.dagger.repository.datasource.database

import com.example.android.dagger.entity.Photos
import javax.inject.Inject

class PexelsDatabaseDataSourceImpl @Inject constructor(val pexelDao: PhotosDao) : PexelsDatabaseDataSource {

    override fun insertImages(photos: List<Photos>) {
        pexelDao.insert(photos)
    }

    override fun findAllImages(): List<Photos> = pexelDao.findAll()

}