package com.example.unsplash.networking.data.models

import android.net.Uri
import com.example.unsplash.networking.data.Auth
import com.example.unsplash.networking.data.AuthConfig
import net.openid.appauth.*

class AuthRepository {

    private fun getServiceConfig(): AuthorizationServiceConfiguration =
        AuthorizationServiceConfiguration(
            Uri.parse(AuthConfig.AUTH_URI),
            Uri.parse(AuthConfig.TOKEN_URI)
        )

    fun getAuthRequest(): AuthorizationRequest =
        AuthorizationRequest.Builder(
            getServiceConfig(),
            AuthConfig.ACCESS_KEY,
            AuthConfig.RESPONSE_TYPE,
            Uri.parse(AuthConfig.CALLBACK_URL)
        )
            .setCodeVerifier(null)
            .setScope(AuthConfig.SCOPE)
            .build()

    fun performTokenRequest(
        authService: AuthorizationService,
        tokenRequest: TokenRequest,
        onComplete: () -> Unit,
        onError: () -> Unit
    ) {
        authService.performTokenRequest(tokenRequest, getClientAuthentication()) { response, ex ->
            if (response != null) {
                val accessToken = response.accessToken.orEmpty()
                Auth.token = accessToken
                onComplete()
            } else {
                onError()
            }
        }
    }

    private fun getClientAuthentication(): ClientAuthentication {
        return ClientSecretPost(AuthConfig.SECRET_KEY)
    }
}