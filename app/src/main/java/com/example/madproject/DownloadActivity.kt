package com.example.madproject

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.google.android.material.bottomnavigation.BottomNavigationView

class DownloadActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.download)

        // Set up BottomNavigationView
        val bottomNavigationView = findViewById<BottomNavigationView>(R.id.bottom_navigation)

        bottomNavigationView.selectedItemId = R.id.navigation_download

        bottomNavigationView.setOnItemSelectedListener { item ->
            when (item.itemId) {
                R.id.navigation_home -> {
                    // Navigate to MainActivity
                    val intent = Intent(this, MainActivity::class.java)
                    startActivity(intent)
                    finish()
                    true
                }

                R.id.navigation_download -> {
                    true
                }

                R.id.navigation_search -> {
                    // Navigate to SearchActivity
                    val intent = Intent(this, SearchActivity::class.java)
                    startActivity(intent)
                    finish()
                    true
                }

                R.id.navigation_profile -> {
                    // Navigate to UserProfileActivity
                    val intent = Intent(this, UserProfileActivity::class.java)
                    startActivity(intent)
                    finish()
                    true
                }

                else -> false
            }
        }
    }
}
