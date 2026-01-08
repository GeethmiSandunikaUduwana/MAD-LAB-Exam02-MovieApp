package com.example.madproject

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity

class OnboardingScreen1 : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.onboarding_screen_1)

        val nextButton: Button = findViewById(R.id.btnNextOnboard1)

                nextButton.setOnClickListener {
                    // Navigate to OnboardingScreen2Activity
                    val intent = Intent(this, OnboardingScreen2Activity::class.java)
                    startActivity(intent)

                }
            }
        }



