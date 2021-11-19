package com.example.unsplash.networking.data

import net.openid.appauth.ResponseTypeValues

object AuthConfig {

    const val AUTH_URI = "https://unsplash.com/oauth/authorize"
    const val TOKEN_URI = "https://unsplash.com/oauth/token"
    const val RESPONSE_TYPE = ResponseTypeValues.CODE
    const val SCOPE = "public read_user write_user read_photos write_photos write_likes write_followers read_collections write_collections"

    const val ACCESS_KEY = "tm4rPHUHmWN_5-TK6YpcLl3pGKiIPyjyCUvky54WfPw"
    const val SECRET_KEY = "vOKdanz2ZP2MI1cD5REzL90upPubQ66i1cAxqjP702k"
    const val CALLBACK_URL = "school://kts.studio/callback"

}