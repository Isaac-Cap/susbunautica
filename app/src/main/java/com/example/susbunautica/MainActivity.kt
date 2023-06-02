package com.example.subanutica

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import android.os.Looper
import com.example.susbunautica.R

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //aonde e tela de "loading"
        Handler(Looper.getMainLooper()).postDelayed({
            val tempsd = Intent(this@MainActivity, Telactr::class.java)
            startActivity(tempsd)
            finish()},3000)

    }
}