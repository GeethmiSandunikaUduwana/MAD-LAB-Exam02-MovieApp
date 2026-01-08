package com.example.madproject
import android.content.Intent
import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity

class LoginActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)
    }

    fun onLoginButtonClick(view: View) {
        // Navigate to OnboardingScreen1
        val intent = Intent(this, OnboardingScreen1::class.java)
        startActivity(intent)

    }
}