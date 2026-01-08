package com.example.madproject

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import androidx.appcompat.app.AppCompatActivity

class MovieDetailsActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_movie_details)

        val arrowImageView: ImageView = findViewById(R.id.back_button)


        arrowImageView.setOnClickListener {

            val intent = Intent(this, MainActivity::class.java)
            startActivity(intent)
            finish()
        }

        val watchNowButton: Button = findViewById(R.id.watch_now_button)
        watchNowButton.setOnClickListener {
            val intent = Intent(this, WatchNowActivity::class.java)
            startActivity(intent)
        }

        val shareWithFriendsButton: Button = findViewById(R.id.sharebutton)
        shareWithFriendsButton.setOnClickListener {
            val intent = Intent(this, ShareActivity::class.java)
            startActivity(intent)
        }
    }
}