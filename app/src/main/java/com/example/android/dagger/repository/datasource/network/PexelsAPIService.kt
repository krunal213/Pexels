package com.example.android.dagger.repository.datasource.network

import com.example.android.dagger.entity.PexelsResponse
import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Header

interface PexelsAPIService {

    @GET("v1/curated")
    fun getImages(
        @Header("Authorization") authorization : String = "SA5SwgvmW1vgZ48zFnXqoXZJlfU0VFe08c3g3IrYUbTb8XlD1fEn9Qx5"
    ): Call<PexelsResponse>

}

