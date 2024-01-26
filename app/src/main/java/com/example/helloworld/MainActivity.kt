package com.example.helloworld

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main) // Build the image
        val button = findViewById<Button>(R.id.helloButton) // Find the button and assign to a value
        button.setOnClickListener { // Perform an action once user clicks button
            Log.v("Hello world", "Button Clicked!") // confirms in the terminal that everything is functioning - good for debugging
            Toast.makeText(this, "Hello to you too!", Toast.LENGTH_SHORT).show() // Shows the message
        }

    }
}