package com.example.kaitotakeuti.sample1day

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.sax.StartElementListener
import android.widget.Button
import android.widget.TextView
import kotlinx.android.synthetic.main.activity_main.*

class TitleActivity : AppCompatActivity() {

    private lateinit var startButton: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_title)

        startButton = findViewById(R.id.button5)
        val intent = Intent(this, MainActivity::class.java)
        startButton.setOnClickListener{
            startActivity(intent)
        }

    }
}
