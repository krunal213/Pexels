package com.example.android.dagger.repository.datasource.database

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.Query
import com.example.android.dagger.entity.Photos

@Dao
interface PhotosDao {

    @Insert
    fun insert(photos: List<Photos>)

    @Query("select * from photos")
    fun findAll() : List<Photos>

}