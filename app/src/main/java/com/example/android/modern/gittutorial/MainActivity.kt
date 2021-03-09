package com.example.android.modern.gittutorial

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun feature(){

    }

    fun v1(){

    }

    fun v1(a:String) {}
    fun v1(a:String,d:String) {}
}