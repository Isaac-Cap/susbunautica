package com.example.subanutica

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.susbunautica.R

class mundo : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_mundo)

        val button = findViewById<androidx.appcompat.widget.AppCompatButton>(R.id.TlPrB4)//n existe 4 n

        button.setOnClickListener {
            finish()
        }











    }
}