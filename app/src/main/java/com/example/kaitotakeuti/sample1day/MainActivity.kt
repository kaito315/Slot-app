package com.example.kaitotakeuti.sample1day

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import kotlinx.android.synthetic.main.activity_main.*
import java.net.Inet4Address
import java.util.*

class MainActivity : AppCompatActivity() {
    private lateinit var changeButton: Button
    private lateinit var changeButton2: Button
    private lateinit var changeButton3: Button
    private lateinit var changeButton4: Button
    private lateinit var changeTextView: TextView
    private lateinit var changeTextView2: TextView
    private var i = 0
    private var randum = Random()
    private lateinit var buttonScreanChange: Button

    private lateinit var imageView: ImageView
    private lateinit var imageView2: ImageView
    private lateinit var imageView3: ImageView

    private var change1 = 1
    private var change2 = 2
    private var change3 = 3


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        changeButton = findViewById(R.id.button1)
        changeButton2 = findViewById(R.id.button2)
        changeButton3 = findViewById(R.id.button3)
        changeButton4 = findViewById(R.id.button4)
        changeTextView = findViewById(R.id.textView)
        changeTextView2 = findViewById(R.id.textView2)
        imageView = findViewById(R.id.imageView)
        imageView2 = findViewById(R.id.imageView2)
        imageView3 = findViewById(R.id.imageView3)

        changeButton.setOnClickListener {
            i = randum.nextInt(3)
            change1 = i
            when (i) {
                0 -> imageView.setImageResource(R.drawable.ffgai)
                1 -> imageView.setImageResource(R.drawable.sinpan)
                2 -> imageView.setImageResource(R.drawable.tousen)
            }
            changeButton.setEnabled(false) //Buttonを押せなくする
            if (change1 == change2 && change2 == change3 && change1 == change3 && !changeButton.isEnabled && !changeButton2.isEnabled && !changeButton3.isEnabled) {
                changeTextView2.text = "おめでとう"
            }
            //changeTextView.text = i.toString()//←Int型だと表示できないため、String型に変える
        }

        changeButton2.setOnClickListener {
            i = randum.nextInt(3)
            change2 = i
            when (i) {
                0 -> imageView2.setImageResource(R.drawable.ffgai)
                1 -> imageView2.setImageResource(R.drawable.sinpan)
                2 -> imageView2.setImageResource(R.drawable.tousen)
            }
            changeButton2.setEnabled(false) //Buttonを押せなくする
            if (change1 == change2 && change2 == change3 && change1 == change3 && !changeButton.isEnabled && !changeButton2.isEnabled && !changeButton3.isEnabled) {
                changeTextView2.text = "おめでとう"
            }
        }

        changeButton3.setOnClickListener {
            i = randum.nextInt(3)
            change3 = i
            when (i) {
                0 -> imageView3.setImageResource(R.drawable.ffgai)
                1 -> imageView3.setImageResource(R.drawable.sinpan)
                2 -> imageView3.setImageResource(R.drawable.tousen)
            }
            changeButton3.setEnabled(false) //Buttonを押せなくする
            if (change1 == change2 && change2 == change3 && change1 == change3 && !changeButton.isEnabled && !changeButton2.isEnabled && !changeButton3.isEnabled) {
                changeTextView2.text = "おめでとう"
            }
            Log.d("hoge", String.format("%d %d %d", change1, change2, change3))
        }


        changeButton4.setOnClickListener {
            changeButton.setEnabled(true)
            changeButton2.setEnabled(true)
            changeButton3.setEnabled(true)
            changeTextView2.text = ""
        }


        //buttonScreanChange = findViewById(R.id.button1)

        //buttonScreanChange.setOnClickListener {
        //  val intent = Intent(this, EditTest::class.java)
        //  startActivity(intent)
        //}


    }
}
