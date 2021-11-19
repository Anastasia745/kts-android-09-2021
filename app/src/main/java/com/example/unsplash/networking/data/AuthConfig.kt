package com.example.unsplash.networking.data

import net.openid.appauth.ResponseTypeValues

object AuthConfig {

    const val AUTH_URI = "https://unsplash.com/oauth/authorize"
    const val TOKEN_URI = "https://unsplash.com/oauth/token"
    const val RESPONSE_TYPE = ResponseTypeValues.CODE
    const val SCOPE = "public read_user write_user read_photos write_photos write_likes write_followers read_collections write_collections"

    const val ACCESS_KEY = "12gkw9R2ZQLMq0goyL8W6Gy_SdSC2aPzHDdMhk1NWVM"
    const val SECRET_KEY = "n8UvNqlzVb_76X_05cwvAd44phtHs_zsx9LxAcJFIu4"
    const val CALLBACK_URL = "school://kts.studio/callback"

}