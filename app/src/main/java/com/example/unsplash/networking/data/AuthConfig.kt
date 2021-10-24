package com.example.unsplash.networking.data

import net.openid.appauth.ResponseTypeValues

object AuthConfig {

    const val AUTH_URI = "https://unsplash.com/oauth/authorize"
    const val TOKEN_URI = "https://unsplash.com/oauth/token"
    const val RESPONSE_TYPE = ResponseTypeValues.CODE
    const val SCOPE = "public read_user write_user read_photos write_photos write_likes write_followers read_collections write_collections"

    const val ACCESS_KEY = "k9ofBSAW9Pcow_zdBcJPAshgYcjITQ5c-mJZE1B_-IM"
    const val SECRET_KEY = "0CdX_QTNDuwbBXIEDE6OEREii_E_ENuykuB2wrAIpDg"
    const val CALLBACK_URL = "school://kts.studio/callback"

}