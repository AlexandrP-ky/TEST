package com.example.test.critics.presentation

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.example.test.R
import com.example.test.critics.domain.Critic

class CriticAdapter(
    private val listCritic: List<Critic>
) : RecyclerView.Adapter<CriticAdapter.ItemViewHolder>() {


    class ItemViewHolder(val view: View) : RecyclerView.ViewHolder(view) {
        val image: ImageView = view.findViewById(R.id.image_critic)
        val criticName: TextView = view.findViewById(R.id.txt_critic_name)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ItemViewHolder {
        val adapterLayout = LayoutInflater.from(parent.context)
            .inflate(R.layout.item_critic, parent, false)
        return ItemViewHolder(adapterLayout)
    }

    override fun onBindViewHolder(holder: ItemViewHolder, position: Int) {
        val item = listCritic[position]
        val context = holder.view.context

        holder.criticName.text = item.display_name
        if (item.imageUrl == null) {
            holder.image.setImageResource(R.drawable.icon_critic_gr)
        } else {
            Glide.with(context!!)
                .load(item.imageUrl)
                .into(holder.image)
        }
    }

    override fun getItemCount() = listCritic.size
}