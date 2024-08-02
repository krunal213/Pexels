package com.example.android.dagger.viewmodel

import android.app.Application
import androidx.lifecycle.AndroidViewModel
import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import javax.inject.Inject

class PexelsAndroidViewModelFactory @Inject constructor(
    application: Application,
    val modelClasses: Map<Class<*>, @JvmSuppressWildcards AndroidViewModel>
) : ViewModelProvider.AndroidViewModelFactory(application) {

    override fun <T : ViewModel> create(modelClass: Class<T>) =
        modelClasses[modelClass] as T
}