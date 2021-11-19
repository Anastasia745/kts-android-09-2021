package com.example.unsplash.networking.adapter

import android.annotation.SuppressLint
import androidx.recyclerview.widget.DiffUtil
import com.example.unsplash.networking.items.CollectionItem

class DiffUtilItemsCallback : DiffUtil.ItemCallback<Any>() {
    override fun areItemsTheSame(first: Any, second: Any): Boolean {
        return first.javaClass == second.javaClass && when (first) {
            is CollectionItem -> first.id == (second as CollectionItem).id
            else -> true
        }
    }

    @SuppressLint("DiffUtilEquals")
    override fun areContentsTheSame(oldItem: Any, newItem: Any): Boolean = oldItem == newItem
}