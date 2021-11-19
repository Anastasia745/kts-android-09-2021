package com.example.unsplash.networking.adapter

import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.example.unsplash.databinding.ItemPhotoBinding
import com.example.unsplash.networking.items.PhotoItem
import com.example.unsplash.utils.bindingInflate
import com.hannesdorfmann.adapterdelegates4.AbsListItemAdapterDelegate

class PhotosDelegate(
    private val likePhoto: (PhotoItem) -> Unit,
) :
    AbsListItemAdapterDelegate<PhotoItem, Any, PhotosDelegate.Holder>() {
    override fun isForViewType(
        item: Any,
        items: MutableList<Any>,
        position: Int
    ): Boolean {
        return true
    }

    override fun onCreateViewHolder(parent: ViewGroup): Holder {
        return Holder(parent.bindingInflate(ItemPhotoBinding::inflate)) {
            likePhoto(it)
        }
    }


    override fun onBindViewHolder(photoItem: PhotoItem, holder: Holder, payloads: MutableList<Any>) {
        holder.bind(photoItem)
        holder.bind(photoItem)
    }

    class Holder(
        private val binding: ItemPhotoBinding,
        private val likePhoto: (PhotoItem) -> Unit,
    ) : RecyclerView.ViewHolder(binding.root) {

        fun bind(photoItem: PhotoItem) {
            binding.tvAuthor.text = photoItem.username
            binding.tvLikeCount.text = photoItem.likes.toString()

            if (photoItem.likedByUser) {
                binding.buttonLike.setOnClickListener{
                    likePhoto(photoItem)
                    binding.tvLikeCount.text = photoItem.likes.toString()
                }
            } else {
                binding.buttonLike.setOnClickListener {
                    likePhoto(photoItem)
                    binding.tvLikeCount.text = photoItem.likes.toString()
                }
            }

            Glide
                .with(itemView)
                .load(photoItem.imageUrl)
                .into(binding.ivImg)
            Glide
                .with(itemView)
                .load(photoItem.avatar)
                .into(binding.ivAuthor)
        }
    }
}


