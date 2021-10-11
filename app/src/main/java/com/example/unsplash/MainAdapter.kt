package com.example.unsplash

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.DiffUtil
import androidx.recyclerview.widget.RecyclerView
import com.example.unsplash.networking.data.models.Photo
import com.hannesdorfmann.adapterdelegates4.AsyncListDifferDelegationAdapter

/*class MainAdapter : RecyclerView.Adapter<MainAdapter.ViewHolder>() {
    private var items = emptyList<ItemMain>()

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val itemView = LayoutInflater.from(parent.context)
            .inflate(R.layout.item_main, parent, false)

        return ViewHolder(itemView) { item, position ->
            //removeItem(item, position)
            updateItem(item, position)
        }
    }

    override fun getItemCount() = items.size

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.bind(items[position])
    }

    fun setItems(newItems: List<ItemMain>) {
        items = newItems.toList()
        notifyDataSetChanged()
    }

    private fun removeItem(item: ItemMain, position: Int) {
        val newItems = items.toMutableList().apply {
            remove(item)
        }
        items = newItems
        notifyItemRemoved(position)
    }

    private fun updateItem(item: ItemMain, position: Int) {
        val newItems = items.toMutableList().apply {
            item.like_count++
            set(position, item)
        }
        items = newItems
        notifyItemChanged(position)
    }

    class ViewHolder(
        override val containerView: View,
        onItemClick: (item: ItemMain, position: Int) -> Unit
    ) : RecyclerView.ViewHolder(containerView), LayoutContainer {

        private var currentItem: ItemMain? = null

        init {
            containerView.findViewById<Button>(R.id.buttonLike).setOnClickListener {
                currentItem?.let { item ->
                    onItemClick.invoke(item, adapterPosition)
                }
            }
        }

        fun bind(item: ItemMain) = with(containerView) {
            currentItem = item
            findViewById<ImageView>(R.id.ivImg).setImageLevel(item.imgId)
            findViewById<TextView>(R.id.tvAuthor).text = item.author
            findViewById<TextView>(R.id.tvLike_count).text = item.like_count.toString()
        }
    }
}*/

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