package com.example.android.dagger.repository.datasource.database

import androidx.room.Database
import androidx.room.RoomDatabase
import com.example.android.dagger.entity.Photos

@Database(entities = [Photos::class], version = 1, exportSchema = true)
abstract class PhotoDatabase : RoomDatabase() {

    abstract fun photosDao() : PhotosDao
}