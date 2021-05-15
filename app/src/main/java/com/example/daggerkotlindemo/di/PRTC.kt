package com.example.daggerkotlindemo.di

import com.example.daggerkotlindemo.Engine
import javax.inject.Inject

class PRTC  {
    var engine:Engine

    @Inject
    constructor(engine: Engine){
        this.engine = engine
    }

    fun startBus() = engine.startEngine()


}