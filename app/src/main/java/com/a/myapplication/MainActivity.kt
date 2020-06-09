package com.a.myapplication

import android.content.Intent
import android.os.Bundle
import android.util.Log
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_main.*


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        Log.i("onCreate", "onCreate")
        text.setOnClickListener {
            val i = Intent(this@MainActivity, MainActivity2::class.java)
            startActivity(i)
        }
    }


    override fun onStart() {
        super.onStart()
        Log.i("onStart", "onStart")
    }

    override fun onResume() {
        super.onResume()
        Log.i("onResume", "onResume")
    }

    override fun onPause() {
        super.onPause()
        Log.i("onPause", "onPause")
    }

    override fun onRestart() {
        super.onRestart()
        Log.i("onRestart", "onRestart")
    }

    override fun onStop() {
        super.onStop()
        Log.i("onStop", "onStop")
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.i("onDestroy", "onDestroy")
    }
}