package com.example.android.dagger.entity

import androidx.room.ColumnInfo

data class Src (
    @ColumnInfo(name = "original")
	val original : String
)