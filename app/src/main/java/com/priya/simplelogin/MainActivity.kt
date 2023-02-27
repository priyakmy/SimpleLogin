package com.priya.simplelogin

import android.os.Bundle
import android.os.PersistableBundle
import android.util.Log
import android.view.View
import androidx.appcompat.app.AppCompatActivity

class MainActivity: AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        Log.d("MAin", "onCreate: ")
        setContentView(R.layout.activity_main)
    }


    override fun onStart() {
        super.onStart()
        Log.d("MAin", "onStart: ")
    }

    override fun onRestart() {
        super.onRestart()
        Log.d("MAin", "onRestart: ")
    }

    override fun onResume() {
        super.onResume()
        Log.d("MAin", "onResume: ")
    }

    override fun onPause() {
        super.onPause()
        Log.d("MAin", "onPause: ")
    }

    override fun onStop() {
        super.onStop()
        Log.d("MAin", "onStop: ")
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.d("MAin", "onDestroy: ")
    }
}