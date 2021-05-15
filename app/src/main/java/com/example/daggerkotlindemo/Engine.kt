package com.example.daggerkotlindemo

import javax.inject.Inject

class Engine @Inject constructor(){

    fun startEngine() = "Engine Started"
}