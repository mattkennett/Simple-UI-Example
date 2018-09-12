package com.example.classtest

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.EditText

const val EXTRA_MESSAGE_ONE = "com.example.classtest.MESSAGE_ONE"
const val EXTRA_MESSAGE_TWO = "com.example.classtest.MESSAGE_TWO"

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun sendMessage(view: View) {
        val editText = findViewById<EditText>(R.id.textBoxText)
        val message = editText.text.toString()

        val editTextTwo = findViewById<EditText>(R.id.textBoxTextTwo)
        val messageTwo= editTextTwo.text.toString()


        val intent = Intent(this, DisplayMessageActivity::class.java).apply {
            putExtra(EXTRA_MESSAGE_ONE, message)
            putExtra(EXTRA_MESSAGE_TWO, messageTwo)
        }
        startActivity(intent)
    }

}
