package com.example.android.dagger.view

import android.annotation.SuppressLint
import android.os.Bundle
import android.view.View
import android.widget.ProgressBar
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.android.dagger.R
import com.example.android.dagger.Result
import com.example.android.dagger.di.component.DaggerPexelsComponent
import com.example.android.dagger.viewmodel.PexelsViewmodel
import javax.inject.Inject

class PexelsActivity : AppCompatActivity() {

    @Inject lateinit var pexelsViewmodel: PexelsViewmodel

    @SuppressLint("CheckResult")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        DaggerPexelsComponent.factory().create(application).inject(this)
        pexelsViewmodel
            .getImages()
            .subscribe {
                when(it){
                    is Result.Loading ->{
                        findViewById<ProgressBar>(R.id.progressBar).apply {
                            visibility = View.VISIBLE
                        }
                    }
                    is Result.Success ->{
                        findViewById<ProgressBar>(R.id.progressBar).apply {
                            visibility = View.GONE
                        }
                        findViewById<RecyclerView>(R.id.recyclerview).apply {
                            visibility = View.VISIBLE
                            adapter = it.data?.let { it1 -> PexelsAdapter(it1) }
                            layoutManager = LinearLayoutManager(this@PexelsActivity)
                        }
                    }
                    is Result.Error ->{
                        findViewById<ProgressBar>(R.id.progressBar).apply {
                            visibility = View.GONE
                        }
                        findViewById<RecyclerView>(R.id.recyclerview).apply {
                            visibility = View.GONE
                        }
                    }
                }
            }
    }
}