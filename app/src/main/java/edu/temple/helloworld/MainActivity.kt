package edu.temple.helloworld

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class MainActivity : AppCompatActivity() {

    // Declare view properties - the first one is done for you
    lateinit var displayTextView: TextView
    lateinit var nametext: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)//constraint layout is ran

        // Initialize with views defined in Layout - the first one is done for you
        displayTextView = findViewById(R.id.displayTextView)//var is initialized for the display text view
        // , the one that we have to change to the user name entry later on
        nametext = findViewById(R.id.nameEditText)
        findViewById<Button>(R.id.clickMeButton).setOnClickListener {
            if(nametext.text.isEmpty()) {
                displayTextView.text = "Please enter your name."
            }else{
                displayTextView.text = "Hello, ${nametext.text}"
            }

        }


    }
}