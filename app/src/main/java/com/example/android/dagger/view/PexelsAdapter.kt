package com.example.android.dagger.view

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.example.android.dagger.entity.Photos
import com.example.android.dagger.R

class PexelsAdapter(val photos: List<Photos>) :
    RecyclerView.Adapter<PexelsAdapter.PexelsViewHolder>() {

    class PexelsViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView)

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int) =
        PexelsViewHolder(
            LayoutInflater.from(parent.context).inflate(R.layout.adapter_pexels, parent, false)
        )

    override fun getItemCount() = photos.size

    override fun onBindViewHolder(holder: PexelsViewHolder, position: Int) {
        val photo = photos[position]
        Glide
            .with(holder.itemView.context)
            .load(photo.src.original)
            .centerCrop()
            .into(holder.itemView.findViewById(R.id.imageView))
        holder.itemView.findViewById<TextView>(R.id.textView).text = photo.photographer
    }
}