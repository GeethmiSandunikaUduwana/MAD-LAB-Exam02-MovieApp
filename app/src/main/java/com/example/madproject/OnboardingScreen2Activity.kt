package com.example.madproject

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity

class OnboardingScreen2Activity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.onboard_screen_2)

        val nextButton: Button = findViewById(R.id.nextButton)

        nextButton.setOnClickListener {
            // Navigate to OnboardingScreen3Activity
            val intent = Intent(this, OnboardingScreen3Activity::class.java)
            startActivity(intent)
        }
    }
}