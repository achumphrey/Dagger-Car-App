package com.example.daggercarapp

import android.util.Log
import javax.inject.Inject

class Car @Inject constructor(private val wheels: Wheels, private val engine: Engine) {

    fun drive(){
        Log.i("Car Class", "Car is driving")
    }
}