package com.example.unsplash.networking.adapter

import androidx.recyclerview.widget.RecyclerView
import com.example.unsplash.networking.items.PhotoItem
import com.hannesdorfmann.adapterdelegates4.AsyncListDifferDelegationAdapter

class PhotoAdapter (
    private val likePhoto: (PhotoItem) -> Unit,
    //private val unlikePhoto: (PhotoItem) -> Unit
) : AsyncListDifferDelegationAdapter<Any>(DiffUtilItemsCallback()) {

    init {
        delegatesManager
            .addDelegate(PageLoadingAdapterDelegate())
            .addDelegate(PhotosDelegate{
                likePhoto(it)
            })
    }

    override fun onBindViewHolder(
        holder: RecyclerView.ViewHolder,
        position: Int,
        payloads: MutableList<Any?>
    ) {
        super.onBindViewHolder(holder, position, payloads)
    }
}
