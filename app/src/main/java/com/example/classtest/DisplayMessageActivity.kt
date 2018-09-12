package com.example.classtest

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class DisplayMessageActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_display_message)

        val message = intent.getStringExtra(EXTRA_MESSAGE_ONE)

        val textView = findViewById<TextView>(R.id.mySweetMessage)

        textView.text = message

        val messageTwo = intent.getStringExtra(EXTRA_MESSAGE_TWO)

        val textViewTwo = findViewById<TextView>(R.id.mySweetMessageTwo)

        textViewTwo.text = messageTwo
    }
}
