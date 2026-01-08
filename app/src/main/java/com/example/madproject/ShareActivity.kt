package com.example.madproject

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity

class ShareActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_share)

        val sharePlayButton: Button = findViewById(R.id.shareplay_button)

        sharePlayButton.setOnClickListener {
            val intent = Intent(this, ViewerListActivity::class.java)
            startActivity(intent)
        }
    }
}