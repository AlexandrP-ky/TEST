package com.example.test.reviews.presentation

import android.content.Context
import android.content.Intent
import android.net.Uri
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.example.test.R
import com.example.test.reviews.domain.Reviews

class ReviewAdapter(
    private val listReview: List<Reviews>
) : RecyclerView.Adapter<ReviewAdapter.ItemViewHolder>() {


    class ItemViewHolder(val view: View) : RecyclerView.ViewHolder(view) {
        val imageMovie: ImageView = view.findViewById(R.id.image_movie)
        val titleMovie: TextView = view.findViewById(R.id.txt_title)
        val summaryMovie: TextView = view.findViewById(R.id.summary_short)
        val byline: TextView = view.findViewById(R.id.txt_critic_name_review)
        val dateFormat: TextView = view.findViewById(R.id.date_format)
        val button: Button = view.findViewById<Button>(R.id.read_review)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ItemViewHolder {
        val adapterLayout = LayoutInflater.from(parent.context)
            .inflate(R.layout.item_review, parent, false)
        return ItemViewHolder(adapterLayout)
    }

    override fun onBindViewHolder(holder: ItemViewHolder, position: Int) {
        val item = listReview[position]
        val context = holder.view.context

        holder.button.setOnClickListener {
            val queryUrl: Uri = Uri.parse("${item.url}")
            val intent = Intent(Intent.ACTION_VIEW, queryUrl)
            context.startActivity(intent)
        }

        holder.titleMovie.text = item.title
        holder.summaryMovie.text = item.summary
        holder.byline.text = item.byline
//        holder.dateFormat.text = item.dateUpdated.toString()
        Glide.with(context!!)
            .load(item.imageUrl)
            .into(holder.imageMovie)
    }

    override fun getItemCount() = listReview.size
}