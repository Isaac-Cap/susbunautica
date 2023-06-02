package com.example.subanutica

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageButton
import com.example.susbunautica.R
import com.example.susbunautica.ferramentas

class Telactr : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_telactr)

        val persoto = findViewById<ImageButton>(R.id.perso)

        persoto.setOnClickListener {
            val suka = Intent (this,personagem::class.java)
            startActivity(suka)
        }
        val aurorases = findViewById<ImageButton>(R.id.auroraB)

        aurorases.setOnClickListener {
            val suka = Intent (this,aurora::class.java)
            startActivity(suka)
        }
        val mundos = findViewById<ImageButton>(R.id.mundoib)

        mundos.setOnClickListener {
            val suka = Intent (this,mundo::class.java)
            startActivity(suka)
        }
        val imperatrizs = findViewById<ImageButton>(R.id.imperatriz)

        imperatrizs.setOnClickListener {
            val suka = Intent (this,imperatriz::class.java)
            startActivity(suka)
        }
        val ferramen = findViewById<ImageButton>(R.id.ferramentasbuim)

        ferramen.setOnClickListener {
            val suka = Intent (this,ferramentas::class.java)
            startActivity(suka)
        }

        val bacte = findViewById<ImageButton>(R.id.bacteria)

        bacte.setOnClickListener {
            val suka = Intent (this,bacteria::class.java)
            startActivity(suka)
        }


    }
}