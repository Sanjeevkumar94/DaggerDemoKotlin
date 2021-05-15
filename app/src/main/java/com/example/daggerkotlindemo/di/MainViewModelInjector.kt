package com.example.daggerkotlindemo.di

import com.example.daggerkotlindemo.Car
import dagger.Component

@Component
interface MainViewModelInjector {
    fun getInjection():Car
}