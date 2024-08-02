package com.example.android.dagger.repository

import com.example.android.dagger.entity.Photos

interface PexelsRepository {

    fun getImages() : List<Photos>?
}