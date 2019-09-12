package com.example.daggercarapp

import javax.inject.Inject

class Engine @Inject constructor(private val piston: Piston) {
}