package com.example.unsplash.networking.adapter

import com.hannesdorfmann.adapterdelegates4.AsyncListDifferDelegationAdapter

class CollectionsAdapter (
) : AsyncListDifferDelegationAdapter<Any>(DiffUtilItemsCallback()) {

    init {
        delegatesManager
            .addDelegate(PageLoadingAdapterDelegate())
            .addDelegate(CollectionsDelegate())
    }
}

