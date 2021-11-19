package com.example.unsplash;

import java.lang.System;

@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010!\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0001\u0014B\u0005\u00a2\u0006\u0002\u0010\u0004J&\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u00022\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00020\t2\u0006\u0010\n\u001a\u00020\u000bH\u0014J&\u0010\f\u001a\u00020\r2\u0006\u0010\u0007\u001a\u00020\u00022\u0006\u0010\u000e\u001a\u00020\u00032\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00100\tH\u0014J\u0010\u0010\u0011\u001a\u00020\u00032\u0006\u0010\u0012\u001a\u00020\u0013H\u0014\u00a8\u0006\u0015"}, d2 = {"Lcom/example/unsplash/MainAdapterDelegate;", "Lcom/hannesdorfmann/adapterdelegates4/AbsListItemAdapterDelegate;", "Lcom/example/unsplash/networking/data/models_/Photo;", "Lcom/example/unsplash/MainAdapterDelegate$Holder;", "()V", "isForViewType", "", "item", "items", "", "position", "", "onBindViewHolder", "", "holder", "payloads", "", "onCreateViewHolder", "parent", "Landroid/view/ViewGroup;", "Holder", "app_debug"})
public final class MainAdapterDelegate extends com.hannesdorfmann.adapterdelegates4.AbsListItemAdapterDelegate<com.example.unsplash.networking.data.models_.Photo, com.example.unsplash.networking.data.models_.Photo, com.example.unsplash.MainAdapterDelegate.Holder> {
    
    public MainAdapterDelegate() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    protected com.example.unsplash.MainAdapterDelegate.Holder onCreateViewHolder(@org.jetbrains.annotations.NotNull()
    android.view.ViewGroup parent) {
        return null;
    }
    
    @java.lang.Override()
    protected boolean isForViewType(@org.jetbrains.annotations.NotNull()
    com.example.unsplash.networking.data.models_.Photo item, @org.jetbrains.annotations.NotNull()
    java.util.List<com.example.unsplash.networking.data.models_.Photo> items, int position) {
        return false;
    }
    
    @java.lang.Override()
    protected void onBindViewHolder(@org.jetbrains.annotations.NotNull()
    com.example.unsplash.networking.data.models_.Photo item, @org.jetbrains.annotations.NotNull()
    com.example.unsplash.MainAdapterDelegate.Holder holder, @org.jetbrains.annotations.NotNull()
    java.util.List<java.lang.Object> payloads) {
    }
    
    @kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u000e\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\t"}, d2 = {"Lcom/example/unsplash/MainAdapterDelegate$Holder;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "binding", "Lcom/example/unsplash/databinding/ItemMainBinding;", "(Lcom/example/unsplash/databinding/ItemMainBinding;)V", "bind", "", "item", "Lcom/example/unsplash/networking/data/models_/Photo;", "app_debug"})
    public static final class Holder extends androidx.recyclerview.widget.RecyclerView.ViewHolder {
        private final com.example.unsplash.databinding.ItemMainBinding binding = null;
        
        public Holder(@org.jetbrains.annotations.NotNull()
        com.example.unsplash.databinding.ItemMainBinding binding) {
            super(null);
        }
        
        public final void bind(@org.jetbrains.annotations.NotNull()
        com.example.unsplash.networking.data.models_.Photo item) {
        }
    }
}