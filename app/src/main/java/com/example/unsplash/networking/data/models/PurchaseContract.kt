package com.example.unsplash.networking.data.models

object PurchaseContract {

    const val TABLE_NAME = "photos"

    object Columns {
        const val ID = "id"
        const val PHOTO_ID = "photo_id"
        const val ALT_DESCRIPTION = "alt_description"
        const val URLS = "urls"
        const val LIKES = "likes"
        const val LIKED_BY_USER = "liked_by_user"
        const val RAW = "raw"
    }

}
