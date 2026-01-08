package com.example.madproject

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity

class SignupActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.sign_up)

        val logNowButton: Button = findViewById(R.id.btnlognow)

        logNowButton.setOnClickListener {
            // Navigate to OnboardingScreen1
            val intent = Intent(this, OnboardingScreen1::class.java)
            startActivity(intent)

        }
    }
}