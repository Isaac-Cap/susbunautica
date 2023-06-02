package com.example.susbunautica

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.subanutica.Telactr

class ferramentas : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_ferramentas)

        val button = findViewById<androidx.appcompat.widget.AppCompatButton>(R.id.TlPrB2)

        button.setOnClickListener {

            finish()
        }
    }
}