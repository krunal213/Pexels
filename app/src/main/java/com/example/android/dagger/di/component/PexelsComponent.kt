package com.example.android.dagger.di.component

import android.app.Application
import com.example.android.dagger.view.PexelsActivity
import com.example.android.dagger.di.module.AndroidViewmodelModule
import com.example.android.dagger.di.module.DataSourceModule
import com.example.android.dagger.di.module.DatabaseModule
import com.example.android.dagger.di.module.NetworkModule
import com.example.android.dagger.di.module.PexelsRepositoryModule
import dagger.BindsInstance
import dagger.Component
import javax.inject.Singleton

@Singleton
@Component(modules = [
    NetworkModule::class,
    DataSourceModule::class,
    PexelsRepositoryModule::class,
    AndroidViewmodelModule::class,
    DatabaseModule::class
])
interface PexelsComponent {

    @Component.Factory
    interface Factory {
        fun create(@BindsInstance application: Application) : PexelsComponent
    }

    fun inject(pexelsActivity: PexelsActivity)

}