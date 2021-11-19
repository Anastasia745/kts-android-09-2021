package com.example.unsplash.networking.data.models;

import java.lang.System;

@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u00c6\u0002\u0018\u00002\u00020\u0001:\u0001\u0005B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0006"}, d2 = {"Lcom/example/unsplash/networking/data/models/PurchaseContract;", "", "()V", "TABLE_NAME", "", "Columns", "app_debug"})
public final class PurchaseContract {
    @org.jetbrains.annotations.NotNull()
    public static final com.example.unsplash.networking.data.models.PurchaseContract INSTANCE = null;
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String TABLE_NAME = "photos";
    
    private PurchaseContract() {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u000b"}, d2 = {"Lcom/example/unsplash/networking/data/models/PurchaseContract$Columns;", "", "()V", "ALT_DESCRIPTION", "", "ID", "LIKED_BY_USER", "LIKES", "PHOTO_ID", "RAW", "URLS", "app_debug"})
    public static final class Columns {
        @org.jetbrains.annotations.NotNull()
        public static final com.example.unsplash.networking.data.models.PurchaseContract.Columns INSTANCE = null;
        @org.jetbrains.annotations.NotNull()
        public static final java.lang.String ID = "id";
        @org.jetbrains.annotations.NotNull()
        public static final java.lang.String PHOTO_ID = "photo_id";
        @org.jetbrains.annotations.NotNull()
        public static final java.lang.String ALT_DESCRIPTION = "alt_description";
        @org.jetbrains.annotations.NotNull()
        public static final java.lang.String URLS = "urls";
        @org.jetbrains.annotations.NotNull()
        public static final java.lang.String LIKES = "likes";
        @org.jetbrains.annotations.NotNull()
        public static final java.lang.String LIKED_BY_USER = "liked_by_user";
        @org.jetbrains.annotations.NotNull()
        public static final java.lang.String RAW = "raw";
        
        private Columns() {
            super();
        }
    }
}