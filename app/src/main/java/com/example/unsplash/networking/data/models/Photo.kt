package com.example.unsplash.networking.data.models

import androidx.room.*
import com.squareup.moshi.Json

@Entity(
    tableName = PurchaseContract.TABLE_NAME,
    indices = [
        Index(PurchaseContract.Columns.ID)
    ]
)
data class Photo(
    @PrimaryKey(autoGenerate = true)
    @ColumnInfo(name = PurchaseContract.Columns.ID)
    val id: Long,
    /*@ColumnInfo(name = PurchaseContract.Columns.PHOTO_ID)
    val photo_id: Long,*/
    @ColumnInfo(name = PurchaseContract.Columns.ALT_DESCRIPTION)
    val alt_description: String,
    @ColumnInfo(name = PurchaseContract.Columns.URLS)
    val urls: String,
    @ColumnInfo(name = PurchaseContract.Columns.RAW)
    /*val raw: String,
    @ColumnInfo(name = PurchaseContract.Columns.LIKES)*/
    val likes: Int,
    @ColumnInfo(name = PurchaseContract.Columns.LIKED_BY_USER)
    val liked_by_user: Boolean)

/*data class Urls(
    @ColumnInfo(name = PurchaseContract.Columns.RAW)
    val raw: String
)*/
