package com.example.unsplash;

import java.lang.System;

@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000r\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u0003\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u0006\u0010\u001e\u001a\u00020\u001cJ.\u0010\u001e\u001a\u00020\u001c2\u0006\u0010\u001f\u001a\u00020 2\u0006\u0010!\u001a\u00020\"2\u0006\u0010#\u001a\u00020\"2\u0006\u0010$\u001a\u00020\u001a2\u0006\u0010%\u001a\u00020\u000bJ\u000e\u0010&\u001a\u00020\u001c2\u0006\u0010\'\u001a\u00020\u001aJ\u0019\u0010(\u001a\u00020\u001c2\u0006\u0010)\u001a\u00020*H\u0082@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010+R\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0006X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0017\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u000b0\n8F\u00a2\u0006\u0006\u001a\u0004\b\t\u0010\fR\u001c\u0010\r\u001a\u0010\u0012\f\u0012\n \u000f*\u0004\u0018\u00010\u000b0\u000b0\u000eX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001d\u0010\u0010\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00120\u00110\n8F\u00a2\u0006\u0006\u001a\u0004\b\u0013\u0010\fR\u000e\u0010\u0014\u001a\u00020\u0015X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0016\u001a\u00020\u0017X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u001a0\u0019X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u001c0\u0019X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001a\u0010\u001d\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00120\u00110\u000eX\u0082\u0004\u00a2\u0006\u0002\n\u0000\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006,"}, d2 = {"Lcom/example/unsplash/MainViewModel;", "Landroidx/lifecycle/AndroidViewModel;", "application", "Landroid/app/Application;", "(Landroid/app/Application;)V", "currentSearchJob", "Lkotlinx/coroutines/Job;", "datastoreRepository", "Lcom/example/unsplash/DatastoreRepository;", "isLoading", "Landroidx/lifecycle/LiveData;", "", "()Landroidx/lifecycle/LiveData;", "isLoadingLiveData", "Landroidx/lifecycle/MutableLiveData;", "kotlin.jvm.PlatformType", "photoList", "", "Lcom/example/unsplash/networking/data/models_/Photo;", "getPhotoList", "photoRepository", "Lcom/example/unsplash/networking/data/PhotoRepository;", "repository", "Lcom/example/unsplash/networking/data/ListPhotos;", "saveError", "Lkotlinx/coroutines/channels/Channel;", "", "saveSuccess", "", "userListLiveData", "save", "id", "", "alt_description", "", "urls", "likes", "liked_by_user", "search", "page", "showError", "t", "", "(Ljava/lang/Throwable;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "app_debug"})
public final class MainViewModel extends androidx.lifecycle.AndroidViewModel {
    private final com.example.unsplash.DatastoreRepository datastoreRepository = null;
    private final com.example.unsplash.networking.data.ListPhotos repository = null;
    private final com.example.unsplash.networking.data.PhotoRepository photoRepository = null;
    private final kotlinx.coroutines.channels.Channel<java.lang.Integer> saveError = null;
    private final kotlinx.coroutines.channels.Channel<kotlin.Unit> saveSuccess = null;
    private final androidx.lifecycle.MutableLiveData<java.util.List<com.example.unsplash.networking.data.models_.Photo>> userListLiveData = null;
    private final androidx.lifecycle.MutableLiveData<java.lang.Boolean> isLoadingLiveData = null;
    private kotlinx.coroutines.Job currentSearchJob;
    
    public MainViewModel(@org.jetbrains.annotations.NotNull()
    android.app.Application application) {
        super(null);
    }
    
    public final void save() {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<java.util.List<com.example.unsplash.networking.data.models_.Photo>> getPhotoList() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<java.lang.Boolean> isLoading() {
        return null;
    }
    
    public final void search(int page) {
    }
    
    public final void save(long id, @org.jetbrains.annotations.NotNull()
    java.lang.String alt_description, @org.jetbrains.annotations.NotNull()
    java.lang.String urls, int likes, boolean liked_by_user) {
    }
    
    private final java.lang.Object showError(java.lang.Throwable t, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return null;
    }
}