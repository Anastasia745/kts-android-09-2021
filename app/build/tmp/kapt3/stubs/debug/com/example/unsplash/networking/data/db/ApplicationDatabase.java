package com.example.unsplash.networking.data.db;

import java.lang.System;

@androidx.room.Database(entities = {com.example.unsplash.networking.data.models.Photo.class}, version = 1)
@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\'\u0018\u0000 \u00052\u00020\u0001:\u0001\u0005B\u0005\u00a2\u0006\u0002\u0010\u0002J\b\u0010\u0003\u001a\u00020\u0004H&\u00a8\u0006\u0006"}, d2 = {"Lcom/example/unsplash/networking/data/db/ApplicationDatabase;", "Landroidx/room/RoomDatabase;", "()V", "photoDao", "Lcom/example/unsplash/networking/data/db/PhotoDao;", "Companion", "app_debug"})
public abstract class ApplicationDatabase extends androidx.room.RoomDatabase {
    @org.jetbrains.annotations.NotNull()
    public static final com.example.unsplash.networking.data.db.ApplicationDatabase.Companion Companion = null;
    public static final int DB_VERSION = 1;
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String DB_NAME = "app-database";
    
    public ApplicationDatabase() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public abstract com.example.unsplash.networking.data.db.PhotoDao photoDao();
    
    @kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0086T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0007"}, d2 = {"Lcom/example/unsplash/networking/data/db/ApplicationDatabase$Companion;", "", "()V", "DB_NAME", "", "DB_VERSION", "", "app_debug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
    }
}