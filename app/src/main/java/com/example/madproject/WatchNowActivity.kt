package com.example.madproject

import android.content.Intent
import android.os.Bundle
import android.widget.ImageView // Import ImageView
import androidx.appcompat.app.AppCompatActivity

class WatchNowActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_watch_now)

        val backArrow: ImageView = findViewById(R.id.back_arrow)

        backArrow.setOnClickListener {
            val intent = Intent(this, MovieDetailsActivity::class.java)
            startActivity(intent)
            finish()
        }
    }
}