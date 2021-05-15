package com.example.daggerkotlindemo.di

import com.example.daggerkotlindemo.Car
import com.example.daggerkotlindemo.MainActivity
import dagger.Component

@Component
interface MainViewModelInjector {

fun injectFields(mainActivity: MainActivity)
}