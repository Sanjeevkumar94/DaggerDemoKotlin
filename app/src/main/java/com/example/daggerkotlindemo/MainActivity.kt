package com.example.daggerkotlindemo

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.example.daggerkotlindemo.di.DaggerMainViewModelInjector

class MainActivity : AppCompatActivity() {

    var car:Car?=null
    
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        car = DaggerMainViewModelInjector.create().getInjection()
        car?.let {
            Toast.makeText(this,it.startCar(),Toast.LENGTH_SHORT).show()
        }
    }
}