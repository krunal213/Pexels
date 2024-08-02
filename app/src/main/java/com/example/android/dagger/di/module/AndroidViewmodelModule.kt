package com.example.android.dagger.di.module

import androidx.lifecycle.AndroidViewModel
import com.example.android.dagger.viewmodel.PexelsViewmodel
import dagger.Binds
import dagger.Module
import dagger.multibindings.ClassKey
import dagger.multibindings.IntoMap

@Module
abstract class AndroidViewmodelModule {

    @Binds
    @IntoMap
    @ClassKey(PexelsViewmodel::class)
    abstract fun bindsPexelsViewmodel(pexelsViewmodel: PexelsViewmodel) : AndroidViewModel
}