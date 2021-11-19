package com.example.unsplash.networking.adapter

import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.example.unsplash.databinding.ItemCollectionBinding
import com.example.unsplash.networking.items.CollectionItem
import com.example.unsplash.utils.bindingInflate
import com.hannesdorfmann.adapterdelegates4.AbsListItemAdapterDelegate

class CollectionsDelegate (
) :
    AbsListItemAdapterDelegate<CollectionItem, Any, CollectionsDelegate.Holder>() {
    override fun isForViewType(
        item: Any,
        items: MutableList<Any>,
        position: Int
    ): Boolean {
        return true
    }

    override fun onCreateViewHolder(parent: ViewGroup): Holder {
        return Holder(parent.bindingInflate(ItemCollectionBinding::inflate))
    }

    override fun onBindViewHolder(collectionItem: CollectionItem, holder: Holder, payloads: MutableList<Any>) {
        holder.bind(collectionItem)
    }

    class Holder(
        private val binding: ItemCollectionBinding,
    ) : RecyclerView.ViewHolder(binding.root) {

        fun bind(collectionItem: CollectionItem) {
            binding.tvAuthorCollection.text = collectionItem.username

            Glide
                .with(itemView)
                .load(collectionItem.raw)
                .into(binding.ivImgCollection)
            Glide
                .with(itemView)
                .load(collectionItem.avatar)
                .into(binding.ivAuthorCollection)
        }
    }
}
