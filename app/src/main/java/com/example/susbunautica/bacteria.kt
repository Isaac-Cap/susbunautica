
package com.example.subanutica

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.susbunautica.R

class bacteria : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_bacteria)

        val button = findViewById<androidx.appcompat.widget.AppCompatButton>(R.id.TlPrB1)

        button.setOnClickListener {
            finish()
        }





    }
}