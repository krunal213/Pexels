package com.example.android.dagger.viewmodel

import android.app.Application
import androidx.lifecycle.AndroidViewModel
import com.example.android.dagger.repository.PexelsRepository
import com.example.android.dagger.entity.Photos
import com.example.android.dagger.Result
import io.reactivex.rxjava3.android.schedulers.AndroidSchedulers
import io.reactivex.rxjava3.core.Observable
import io.reactivex.rxjava3.schedulers.Schedulers
import javax.inject.Inject

class PexelsViewmodel @Inject constructor(application: Application, val pexelsRepository: PexelsRepository) :
    AndroidViewModel(application) {

    fun getImages() = Observable.create<Result<List<Photos>?>> {
        try {
            it.onNext(Result.Loading)
            it.onNext(Result.Success(pexelsRepository.getImages()))
        } catch (ex: Exception) {
            it.onNext(Result.Error(Exception("Something went wrong !")))
        }
    }.subscribeOn(Schedulers.io()).observeOn(AndroidSchedulers.mainThread())

}