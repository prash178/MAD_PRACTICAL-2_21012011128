package com.example.mad_practical_2_21012011128

import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.google.android.material.floatingactionbutton.FloatingActionButton

class MainActivity : AppCompatActivity() {

    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val playButton:FloatingActionButton = findViewById(R.id.play)
        playButton.setOnClickListener {
            PlayPause()
        }

        val pauseButton:FloatingActionButton = findViewById(R.id.pause)
        pauseButton.setOnClickListener {
            Stop()
        }
    }
    fun PlayPause(){
        Intent(applicationContext,MyService::class.java).putExtra(MyService.PLAYERKEY,MyService.PLAYERVALUE).apply {
            startService(this)
        }
    }

    fun Stop(){
        Intent(applicationContext,MyService::class.java).putExtra(MyService.PLAYERKEY,MyService.PLAYERVALUE).apply {
            stopService(this)
        }
    }
}