package com.example.subanutica

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.susbunautica.R

class aurora : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_aurora)


        val button = findViewById<androidx.appcompat.widget.AppCompatButton>(R.id.TlPrB)

        button.setOnClickListener {
            finish()
        }


    }
}