package com.example.reyclerview

import android.content.Context
import android.text.Layout
import android.view.LayoutInflater

import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide

class Adapter(private val links: List<Photos>, private val context: Context)
    : RecyclerView.Adapter<Adapter.ViewHolder>() {

    class ViewHolder(itemView:View) : RecyclerView.ViewHolder(itemView) {


        val imageView:ImageView = itemView.findViewById(R.id.imageView)


    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.photos, parent, false)
        return ViewHolder(view)
    }

    override fun getItemCount(): Int = links.size



    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val p = links[position]
        Glide.with(context)
            .load(p.link)
            .placeholder(R.drawable.ic_launcher_background)
            .centerCrop()
            .into(holder.imageView)

    }
}