package com.example.unsplash;

import java.lang.System;

@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006J\u000e\u0010 \u001a\u00020\r2\u0006\u0010!\u001a\u00020\"J\u000e\u0010#\u001a\u00020\r2\u0006\u0010$\u001a\u00020%J\b\u0010&\u001a\u00020\rH\u0014J\u0006\u0010\'\u001a\u00020\rR\u000e\u0010\u0007\u001a\u00020\bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\nX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0017\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\r0\f8F\u00a2\u0006\u0006\u001a\u0004\b\u000e\u0010\u000fR\u0014\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\r0\u0011X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0017\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00130\f8F\u00a2\u0006\u0006\u001a\u0004\b\u0014\u0010\u000fR\u001c\u0010\u0015\u001a\u0010\u0012\f\u0012\n \u0017*\u0004\u0018\u00010\u00130\u00130\u0016X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0017\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00190\f8F\u00a2\u0006\u0006\u001a\u0004\b\u001a\u0010\u000fR\u0014\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u00190\u0011X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0017\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u001d0\f8F\u00a2\u0006\u0006\u001a\u0004\b\u001e\u0010\u000fR\u0014\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\u001d0\u0011X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006("}, d2 = {"Lcom/example/unsplash/LoginViewModel;", "Landroidx/lifecycle/AndroidViewModel;", "application", "Landroid/app/Application;", "state", "Landroidx/lifecycle/SavedStateHandle;", "(Landroid/app/Application;Landroidx/lifecycle/SavedStateHandle;)V", "authRepository", "Lcom/example/unsplash/networking/data/models_/AuthRepository;", "authService", "Lnet/openid/appauth/AuthorizationService;", "authSuccessLiveData", "Landroidx/lifecycle/LiveData;", "", "getAuthSuccessLiveData", "()Landroidx/lifecycle/LiveData;", "authSuccessLiveEvent", "Lcom/example/unsplash/utils/SingleLiveEvent;", "loadingLiveData", "", "getLoadingLiveData", "loadingMutableLiveData", "Landroidx/lifecycle/MutableLiveData;", "kotlin.jvm.PlatformType", "openAuthPageLiveData", "Landroid/content/Intent;", "getOpenAuthPageLiveData", "openAuthPageLiveEvent", "toastLiveData", "", "getToastLiveData", "toastLiveEvent", "onAuthCodeFailed", "exception", "Lnet/openid/appauth/AuthorizationException;", "onAuthCodeReceived", "tokenRequest", "Lnet/openid/appauth/TokenRequest;", "onCleared", "openLoginPage", "app_debug"})
public final class LoginViewModel extends androidx.lifecycle.AndroidViewModel {
    private final com.example.unsplash.networking.data.models_.AuthRepository authRepository = null;
    private final net.openid.appauth.AuthorizationService authService = null;
    private final com.example.unsplash.utils.SingleLiveEvent<android.content.Intent> openAuthPageLiveEvent = null;
    private final com.example.unsplash.utils.SingleLiveEvent<java.lang.Integer> toastLiveEvent = null;
    private final androidx.lifecycle.MutableLiveData<java.lang.Boolean> loadingMutableLiveData = null;
    private final com.example.unsplash.utils.SingleLiveEvent<kotlin.Unit> authSuccessLiveEvent = null;
    
    public LoginViewModel(@org.jetbrains.annotations.NotNull()
    android.app.Application application, @org.jetbrains.annotations.NotNull()
    androidx.lifecycle.SavedStateHandle state) {
        super(null);
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<android.content.Intent> getOpenAuthPageLiveData() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<java.lang.Boolean> getLoadingLiveData() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<java.lang.Integer> getToastLiveData() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<kotlin.Unit> getAuthSuccessLiveData() {
        return null;
    }
    
    public final void onAuthCodeFailed(@org.jetbrains.annotations.NotNull()
    net.openid.appauth.AuthorizationException exception) {
    }
    
    public final void onAuthCodeReceived(@org.jetbrains.annotations.NotNull()
    net.openid.appauth.TokenRequest tokenRequest) {
    }
    
    public final void openLoginPage() {
    }
    
    @java.lang.Override()
    protected void onCleared() {
    }
}