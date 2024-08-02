package com.example.android.dagger.entity

import androidx.room.ColumnInfo
import androidx.room.Embedded
import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "photos")
data class Photos (
    @PrimaryKey
    val id : Int,
    @ColumnInfo("photographer")
    val photographer : String,
    @Embedded
    val src : Src,
    @ColumnInfo("alt")
    val alt : String
)