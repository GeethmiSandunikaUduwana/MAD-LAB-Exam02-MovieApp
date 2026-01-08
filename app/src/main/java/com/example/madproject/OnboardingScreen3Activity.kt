package com.example.madproject

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity

class OnboardingScreen3Activity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_onboarding)

        val getStartedButton: Button = findViewById(R.id.getStartedButton)

        getStartedButton.setOnClickListener {
            // Navigate to MainActivity
            val intent = Intent(this, MainActivity::class.java)
            startActivity(intent)

        }
    }
}