package com.example.daggerkotlindemo

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.example.daggerkotlindemo.di.DaggerMainViewModelInjector
import com.example.daggerkotlindemo.di.PRTC
import javax.inject.Inject

class MainActivity : AppCompatActivity() {

    @Inject
    lateinit var car:Car

    @Inject
    lateinit var prtc: PRTC


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
         DaggerMainViewModelInjector.create().injectFields(this)
        car?.let {
            Toast.makeText(this,"Car ${it.startCar()}",Toast.LENGTH_SHORT).show()
        }

        prtc?.let {
            Toast.makeText(this,"Prtc Bus ${it.startBus()}",Toast.LENGTH_SHORT).show()
        }
    }
}

/*
1 Field injection mein Variable Private ni hona chahiye.
2 agar apke pass constructor avialble ho toh constructor injection kre.
3 Field injection tabhi krna chahiye jub hum uska constuctor create ni kr skate like Main activity, Retrofit and other Android Framework;*/
/*4 agar constructor injection humare class mein ho ri hogi toh field injection and method injection apne app
    perform ho jayegi.*/
// 5 kotlin mien filed injection ke liye variable lateinit hona chahiye.