package com.example.unsplash

import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.bumptech.glide.load.resource.bitmap.CircleCrop
import com.example.unsplash.databinding.ItemMainBinding
import com.example.unsplash.networking.data.models_.Photo
import com.hannesdorfmann.adapterdelegates4.AbsListItemAdapterDelegate
import com.example.unsplash.utils.bindingInflate

class MainAdapterDelegate: AbsListItemAdapterDelegate<Photo, Photo, MainAdapterDelegate.Holder>() {

    override fun onCreateViewHolder(parent: ViewGroup): Holder {
        return Holder(parent.bindingInflate(ItemMainBinding::inflate))
    }

    override fun isForViewType(
        item: Photo,
        items: MutableList<Photo>,
        position: Int
    ): Boolean {
        return true
    }

    override fun onBindViewHolder(item: Photo, holder: Holder, payloads: MutableList<Any>) {
        holder.bind(item)
    }

    class Holder(
        private val binding: ItemMainBinding
    ) : RecyclerView.ViewHolder(binding.root) {

        fun bind(item: Photo) {
            binding.tvAuthor.text = item.alt_description
            binding.tvLikeCount.text = item.likes.toString()

            //coil, picasso
            Glide.with(itemView)
                .load(item.urls)
                .transform(CircleCrop())
                .placeholder(R.drawable.img1)
                .into(binding.ivImg)
        }
    }
}