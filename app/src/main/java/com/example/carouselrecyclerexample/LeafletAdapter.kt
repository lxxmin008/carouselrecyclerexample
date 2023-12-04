package com.example.carouselrecyclerexample

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.example.carouselrecyclerexample.databinding.CarouselItemBinding

class LeafletAdapter(private var leafletList: List<LeafletModel>): RecyclerView.Adapter<LeafletAdapter.LeafletViewHolder>() {
    class LeafletViewHolder(val binding: CarouselItemBinding): RecyclerView.ViewHolder(binding.root)

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): LeafletViewHolder {
        var binding = CarouselItemBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return LeafletViewHolder(binding)
    }

    override fun getItemCount(): Int = leafletList.size

    override fun onBindViewHolder(holder: LeafletViewHolder, position: Int) {
        val leaflet = leafletList[position]
        holder.binding.apply {
            Glide.with(leafletImage).load(leaflet.image).into(leafletImage)
            leafletName.text = leaflet.name
        }
    }
}