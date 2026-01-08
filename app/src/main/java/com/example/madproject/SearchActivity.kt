package com.example.madproject
import android.content.Intent
import android.os.Bundle
import android.widget.ImageView
import androidx.appcompat.app.AppCompatActivity

class SearchActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_search)

        val arrowImageView: ImageView = findViewById(R.id.arrowImageView)

        arrowImageView.setOnClickListener {

            val intent = Intent(this, MainActivity::class.java)
            startActivity(intent)  // Start MainActivity
            finish()
        }
    }
}