package com.example.myapplication

import android.content.Intent
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.core.content.ContextCompat.startActivity
import androidx.recyclerview.widget.RecyclerView
import com.example.myapplication.R

class ArticleAdapter(val articles:List<Article>):RecyclerView.Adapter<ArticleViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ArticleViewHolder {
        val view: View = LayoutInflater.from(parent.context).inflate(R.layout.item_article,parent,false)
        return ArticleViewHolder(view)
    }

    override fun getItemCount(): Int {
        return articles.size
    }

    override fun onBindViewHolder(holder: ArticleViewHolder, position: Int) {
        val article = articles.get(position)
        holder.title.text = article.title
        holder.image.setImageResource(article.image)
        holder.itemView.setOnClickListener ({
            val intent= Intent(holder.itemView.context,ArticleDetails::class.java)
            intent.putExtra("title",article.title)
            intent.putExtra("image",article.image)
            intent.putExtra("author",article.author)
            intent.putExtra("details",article.details)

            holder.itemView.context.startActivity(intent)

        })
    }
}