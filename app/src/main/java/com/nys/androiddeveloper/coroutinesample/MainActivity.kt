package com.nys.androiddeveloper.coroutinesample

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.async
import kotlinx.coroutines.delay

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


        //Million Coroutine

     /*   val deferred = (1..1_000_000).map { n ->
            GlobalScope.async {
                n
            }
        }

        runBlocking {
            val sum = deferred.sumBy { it.await() }
            println("Sum : $sum")
        }*/

        GlobalScope.async {
            println(workload(12))
        }


    }



    suspend fun workload(n: Int): Int {
        delay(3000)
        return n
    }
}
