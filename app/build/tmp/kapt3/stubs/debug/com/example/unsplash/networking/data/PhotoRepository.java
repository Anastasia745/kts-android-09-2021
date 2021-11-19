package com.example.unsplash.networking.data;

import java.lang.System;

@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\u0010\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0002J\u0019\u0010\t\u001a\u00020\n2\u0006\u0010\u0007\u001a\u00020\bH\u0086@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u000bJ\u0019\u0010\f\u001a\u00020\n2\u0006\u0010\u0007\u001a\u00020\bH\u0086@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u000bR\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006\r"}, d2 = {"Lcom/example/unsplash/networking/data/PhotoRepository;", "", "()V", "userDao", "Lcom/example/unsplash/networking/data/db/PhotoDao;", "isPhotoValid", "", "photo", "Lcom/example/unsplash/networking/data/models/Photo;", "savePhoto", "", "(Lcom/example/unsplash/networking/data/models/Photo;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "updatePhoto", "app_debug"})
public final class PhotoRepository {
    private final com.example.unsplash.networking.data.db.PhotoDao userDao = null;
    
    public PhotoRepository() {
        super();
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object savePhoto(@org.jetbrains.annotations.NotNull()
    com.example.unsplash.networking.data.models.Photo photo, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object updatePhoto(@org.jetbrains.annotations.NotNull()
    com.example.unsplash.networking.data.models.Photo photo, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return null;
    }
    
    private final boolean isPhotoValid(com.example.unsplash.networking.data.models.Photo photo) {
        return false;
    }
}