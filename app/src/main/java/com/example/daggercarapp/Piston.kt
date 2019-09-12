package com.example.daggercarapp

import javax.inject.Inject

class Piston @Inject constructor(private val capacity: Capacity) {
}