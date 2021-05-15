package com.example.daggerkotlindemo

import javax.inject.Inject

class Car @Inject constructor(var engine: Engine) {

    fun startCar() = engine.startEngine()


}