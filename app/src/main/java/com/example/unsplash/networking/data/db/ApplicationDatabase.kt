package com.example.unsplash.networking.data.db

import androidx.room.Database
import androidx.room.RoomDatabase
import com.example.unsplash.networking.data.models.Photo

@Database(
    entities = [
        Photo::class
    ], version = ApplicationDatabase.DB_VERSION
)
abstract class ApplicationDatabase : RoomDatabase() {
    abstract fun photoDao(): PhotoDao

    companion object {
        const val DB_VERSION = 1
        const val DB_NAME = "app-database"
    }
}
