package com.example.myapplication

import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.myapplication.R

class ArticleDetails : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContentView(R.layout.activity_article_details)

        val title=intent.getStringExtra("title")
        val image=intent.getIntExtra("image",0)
        val author=intent.getStringExtra("author")
        val details=intent.getStringExtra("details")

        findViewById<TextView>(R.id.title6).text=title
        findViewById<ImageView>(R.id.image6).setImageResource(image)
        findViewById<TextView>(R.id.author4).text=author
        findViewById<TextView>(R.id.details4).text=details


    }
}