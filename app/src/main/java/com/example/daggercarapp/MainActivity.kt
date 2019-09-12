package com.example.daggercarapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.daggercarapp.dagger.ActivityModule
import com.example.daggercarapp.dagger.DaggerActivityComponent
import javax.inject.Inject

class MainActivity : AppCompatActivity() {

    @Inject

    lateinit var car: Car

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        getDependencies()
        car.drive()
    }

    private fun getDependencies(){

        DaggerActivityComponent.builder()
            .activityModule(ActivityModule())
            .build().inject(this)
    }
}
