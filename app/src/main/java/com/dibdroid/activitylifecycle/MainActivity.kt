package com.dibdroid.activitylifecycle

import android.os.Bundle
import android.util.Log
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import kotlin.math.log

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)

        Toast.makeText(this,"onCreate", Toast.LENGTH_SHORT).show()
        Log.d("TAG","onCreate : I am running")

    }

    override fun onStart() {
        super.onStart()
        Toast.makeText(this,"onStart", Toast.LENGTH_SHORT).show()
        Log.d("TAG","onStart : I am running")
    }

    override fun onResume() {
        super.onResume()
        Toast.makeText(this,"onResume", Toast.LENGTH_SHORT).show()
        Log.d("TAG","onResume : I am running")
    }

    override fun onPause() {
        super.onPause()
        Toast.makeText(this,"onPause", Toast.LENGTH_SHORT).show()
        Log.d("TAG","onPause : I am running")
    }

    override fun onStop() {
        super.onStop()
        Toast.makeText(this,"onStop", Toast.LENGTH_SHORT).show()
        Log.d("TAG","onStop: I am running")
    }

    override fun onRestart() {
        super.onRestart()
        Toast.makeText(this,"onRestart", Toast.LENGTH_SHORT).show()
        Log.d("TAG","onRestart : I am running ")
    }

    override fun onDestroy() {
        super.onDestroy()
        Toast.makeText(this,"onDestroy", Toast.LENGTH_SHORT).show()
        Log.d("TAG","onDestroy : I am running")
    }

}



/*

Toast.makeText(this,"onCrate", Toast.LENGTH_SHORT).show()
        Log.d("TAG" , "onCreate : I am Running")

        }

    override fun onStart() {
        super.onStart()
        Toast.makeText(this,"onStart" , Toast.LENGTH_SHORT).show()
       Log.d("TAG" ,"onStart : I am Running")

    }

    override fun onResume() {
        super.onResume()
        Toast.makeText(this,"onResume", Toast.LENGTH_SHORT).show()
        Log.d("TAG", "onResume : Iam Running")

    }



    override fun onPause() {
        super.onPause()
        Toast.makeText(this,"onPause", Toast.LENGTH_SHORT).show()
        Log.d("TAG", "onPause : I am running")

    }

    override fun onStop() {
        super.onStop()
        Toast.makeText(this,"onStop", Toast.LENGTH_SHORT).show()
        Log.d("TAG","onStop : I am Running")
    }

    override fun onRestart() {
        super.onRestart()
        Toast.makeText(this,"onRestart", Toast.LENGTH_SHORT).show()
        Log.d("TAG", "onRestart : I am Running")

    }

    override fun onDestroy() {
        super.onDestroy()
        Toast.makeText(this,"onDestroy", Toast.LENGTH_SHORT).show()
        Log.d("TAG",  "oonDestroy : I am Running")
    }








 */