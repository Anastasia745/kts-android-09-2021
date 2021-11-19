package com.example.unsplash.networking.data.models_;

import java.lang.System;

@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0014\b\u0087\b\u0018\u00002\u00020\u0001B5\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0006\u001a\u00020\u0007\u0012\b\b\u0001\u0010\b\u001a\u00020\t\u00a2\u0006\u0002\u0010\nJ\t\u0010\u0013\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\u0014\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\u0015\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\u0016\u001a\u00020\u0007H\u00c6\u0003J\t\u0010\u0017\u001a\u00020\tH\u00c6\u0003J;\u0010\u0018\u001a\u00020\u00002\b\b\u0003\u0010\u0002\u001a\u00020\u00032\b\b\u0003\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0003\u0010\u0006\u001a\u00020\u00072\b\b\u0003\u0010\b\u001a\u00020\tH\u00c6\u0001J\u0013\u0010\u0019\u001a\u00020\t2\b\u0010\u001a\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010\u001b\u001a\u00020\u0007H\u00d6\u0001J\t\u0010\u001c\u001a\u00020\u0003H\u00d6\u0001R\u0011\u0010\u0004\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\r\u0010\fR\u0011\u0010\b\u001a\u00020\t\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0011\u0010\u0006\u001a\u00020\u0007\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0011\u0010\u0005\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\f\u00a8\u0006\u001d"}, d2 = {"Lcom/example/unsplash/networking/data/models_/Photo;", "", "id", "", "alt_description", "urls", "likes", "", "likedByUser", "", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;IZ)V", "getAlt_description", "()Ljava/lang/String;", "getId", "getLikedByUser", "()Z", "getLikes", "()I", "getUrls", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "other", "hashCode", "toString", "app_debug"})
@com.squareup.moshi.JsonClass(generateAdapter = true)
public final class Photo {
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String id = null;
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String alt_description = null;
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String urls = null;
    private final int likes = 0;
    private final boolean likedByUser = false;
    
    @org.jetbrains.annotations.NotNull()
    public final com.example.unsplash.networking.data.models_.Photo copy(@org.jetbrains.annotations.NotNull()
    @com.squareup.moshi.Json(name = "id")
    java.lang.String id, @org.jetbrains.annotations.NotNull()
    @com.squareup.moshi.Json(name = "alt_description")
    java.lang.String alt_description, @org.jetbrains.annotations.NotNull()
    java.lang.String urls, @com.squareup.moshi.Json(name = "likes")
    int likes, @com.squareup.moshi.Json(name = "liked_by_user")
    boolean likedByUser) {
        return null;
    }
    
    @java.lang.Override()
    public boolean equals(@org.jetbrains.annotations.Nullable()
    java.lang.Object other) {
        return false;
    }
    
    @java.lang.Override()
    public int hashCode() {
        return 0;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public java.lang.String toString() {
        return null;
    }
    
    public Photo(@org.jetbrains.annotations.NotNull()
    @com.squareup.moshi.Json(name = "id")
    java.lang.String id, @org.jetbrains.annotations.NotNull()
    @com.squareup.moshi.Json(name = "alt_description")
    java.lang.String alt_description, @org.jetbrains.annotations.NotNull()
    java.lang.String urls, @com.squareup.moshi.Json(name = "likes")
    int likes, @com.squareup.moshi.Json(name = "liked_by_user")
    boolean likedByUser) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component1() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getId() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component2() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getAlt_description() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component3() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getUrls() {
        return null;
    }
    
    public final int component4() {
        return 0;
    }
    
    public final int getLikes() {
        return 0;
    }
    
    public final boolean component5() {
        return false;
    }
    
    public final boolean getLikedByUser() {
        return false;
    }
}