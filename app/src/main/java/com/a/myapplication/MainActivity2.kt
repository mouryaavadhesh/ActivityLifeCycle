package com.a.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log

class MainActivity2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)
        Log.i("onCreate-2", "onCreate-2")
    }


    override fun onStart() {
        super.onStart()
        Log.i("onStart-2", "onStart-2")
    }

    override fun onResume() {
        super.onResume()
        Log.i("onResume-2", "onResume-2")
    }

    override fun onPause() {
        super.onPause()
        Log.i("onPause-2", "onPause-2")
    }

    override fun onRestart() {
        super.onRestart()
        Log.i("onRestart-2", "onRestart-2")
    }

    override fun onStop() {
        super.onStop()
        Log.i("onStop-2", "onStop-2")
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.i("onDestroy-2", "onDestroy-2")
    }
}