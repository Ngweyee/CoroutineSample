package com.nys.androiddeveloper.coroutinesample

import android.os.Bundle
import android.util.Log
import androidx.appcompat.app.AppCompatActivity
import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch
import kotlinx.coroutines.runBlocking

const val TAG : String = "MainActivity"

class MainActivity : AppCompatActivity() {



    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        Log.d(TAG,"Start")

        GlobalScope.launch {
            delay(1000)
            Log.d(TAG,"Coroutine");
        }

        runBlocking {
            delay(2000)
            Log.d(TAG,"Stop");

        }
    }
}
