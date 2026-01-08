package com.example.madproject

import android.content.Intent
import android.os.Bundle
import android.widget.ImageView
import androidx.appcompat.app.AppCompatActivity
import com.google.android.material.bottomnavigation.BottomNavigationView

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val avtarImageView: ImageView = findViewById(R.id.avtar)

        avtarImageView.setOnClickListener {
            val intent = Intent(this, MovieDetailsActivity::class.java)
            startActivity(intent)
        }

        val bottomNavigationView = findViewById<BottomNavigationView>(R.id.bottom_navigation)

        bottomNavigationView.setOnItemSelectedListener { item ->
            when (item.itemId) {
                R.id.navigation_home -> true

                R.id.navigation_download -> {
                    startActivity(Intent(this, DownloadActivity::class.java))
                    finish()
                    true
                }

                R.id.navigation_search -> {
                    startActivity(Intent(this, SearchActivity::class.java))
                    finish()
                    true
                }


                R.id.navigation_profile -> {
                    startActivity(Intent(this, UserProfileActivity::class.java))
                    finish()
                    true
                }

                else -> false
            }
        }
    }
}
