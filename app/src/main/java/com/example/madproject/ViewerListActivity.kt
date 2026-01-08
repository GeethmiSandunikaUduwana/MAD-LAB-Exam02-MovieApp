package com.example.madproject

import android.content.Intent
import android.os.Bundle
import android.widget.ImageView
import androidx.appcompat.app.AppCompatActivity

class ViewerListActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.viewer_list)

        val arrowImageView: ImageView = findViewById(R.id.back_arrow)


        arrowImageView.setOnClickListener {
            // Create an Intent to navigate to MainActivity
            val intent = Intent(this, MainActivity::class.java)
            startActivity(intent)
            finish()
        }
    }
}