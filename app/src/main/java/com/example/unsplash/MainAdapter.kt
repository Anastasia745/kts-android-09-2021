package com.example.unsplash

import androidx.recyclerview.widget.DiffUtil
import com.example.unsplash.networking.data.models_.Photo
import com.hannesdorfmann.adapterdelegates4.AsyncListDifferDelegationAdapter

class MainAdapter : AsyncListDifferDelegationAdapter<Photo>(
    UserDiffUtilCallback()
) {

    init {
        delegatesManager.addDelegate(MainAdapterDelegate())
    }

    class UserDiffUtilCallback : DiffUtil.ItemCallback<Photo>() {
        override fun areItemsTheSame(oldItem: Photo, newItem: Photo): Boolean {
            return oldItem.id == newItem.id
        }

        override fun areContentsTheSame(oldItem: Photo, newItem: Photo): Boolean {
            return oldItem == newItem
        }
    }
}