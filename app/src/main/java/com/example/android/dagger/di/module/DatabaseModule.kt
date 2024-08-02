package com.example.android.dagger.di.module

import android.app.Application
import androidx.room.Room
import com.example.android.dagger.repository.datasource.database.PhotoDatabase
import dagger.Module
import dagger.Provides
import javax.inject.Singleton

@Module
object DatabaseModule {

    @Provides
    @Singleton
    fun providePhotoDatabase(application: Application) =
        Room.databaseBuilder(
            application,
            PhotoDatabase::class.java,
            PhotoDatabase::class.java.simpleName
        ).build()

    @Provides
    @Singleton
    fun providePhotosDao(photoDatabase: PhotoDatabase) =
        photoDatabase.photosDao()

}