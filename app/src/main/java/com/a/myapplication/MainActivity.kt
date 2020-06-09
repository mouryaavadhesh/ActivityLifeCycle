package com.a.myapplication

import android.os.Bundle
import android.util.Log
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }


    override fun onStart() {
        super.onStart()
        Log.i("onStart","onStart")
    }

    override fun onStop() {
        super.onStop()
        Log.i("onStart","onStart")

    }

    override fun onRestart() {
        super.onRestart()
        Log.i("onRestart","onRestart")

    }

    override fun onPause() {
        super.onPause()
        Log.i("onPause","onPause")

    }

    override fun onDestroy() {
        super.onDestroy()
        Log.i("onDestroy","onDestroy")

    }
}