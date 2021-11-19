package com.example.unsplash.networking.data.models_;

import java.lang.System;

@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\u0006\u0010\u0003\u001a\u00020\u0004J\b\u0010\u0005\u001a\u00020\u0006H\u0002J2\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\f2\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\b0\u000e2\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\b0\u000e\u00a8\u0006\u0010"}, d2 = {"Lcom/example/unsplash/networking/data/models_/AuthRepository;", "", "()V", "getAuthRequest", "Lnet/openid/appauth/AuthorizationRequest;", "getClientAuthentication", "Lnet/openid/appauth/ClientAuthentication;", "performTokenRequest", "", "authService", "Lnet/openid/appauth/AuthorizationService;", "tokenRequest", "Lnet/openid/appauth/TokenRequest;", "onComplete", "Lkotlin/Function0;", "onError", "app_debug"})
public final class AuthRepository {
    
    public AuthRepository() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final net.openid.appauth.AuthorizationRequest getAuthRequest() {
        return null;
    }
    
    public final void performTokenRequest(@org.jetbrains.annotations.NotNull()
    net.openid.appauth.AuthorizationService authService, @org.jetbrains.annotations.NotNull()
    net.openid.appauth.TokenRequest tokenRequest, @org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function0<kotlin.Unit> onComplete, @org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function0<kotlin.Unit> onError) {
    }
    
    private final net.openid.appauth.ClientAuthentication getClientAuthentication() {
        return null;
    }
}