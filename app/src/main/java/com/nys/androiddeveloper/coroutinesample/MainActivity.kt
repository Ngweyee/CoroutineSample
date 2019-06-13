package com.nys.androiddeveloper.coroutinesample

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.launch
import java.util.concurrent.atomic.AtomicLong

const val TAG: String = "MainActivity"

class MainActivity : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        /*Log.d(TAG,"Start")

        GlobalScope.launch {
            delay(1000)
            Log.d(TAG,"Coroutine");
        }

        runBlocking {
            delay(2000)
            Log.d(TAG,"Stop");

        }*/

        val c = AtomicLong()

        for (i in 1..1_000_000L)
            GlobalScope.launch {
                c.addAndGet(i)
            }

        println(c.get())
    }
}
