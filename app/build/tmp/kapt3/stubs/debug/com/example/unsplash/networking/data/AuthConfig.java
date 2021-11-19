package com.example.unsplash.networking.data;

import java.lang.System;

@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u000b"}, d2 = {"Lcom/example/unsplash/networking/data/AuthConfig;", "", "()V", "ACCESS_KEY", "", "AUTH_URI", "CALLBACK_URL", "RESPONSE_TYPE", "SCOPE", "SECRET_KEY", "TOKEN_URI", "app_debug"})
public final class AuthConfig {
    @org.jetbrains.annotations.NotNull()
    public static final com.example.unsplash.networking.data.AuthConfig INSTANCE = null;
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String AUTH_URI = "https://unsplash.com/oauth/authorize";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String TOKEN_URI = "https://unsplash.com/oauth/token";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String RESPONSE_TYPE = "code";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String SCOPE = "public read_user write_user read_photos write_photos write_likes write_followers read_collections write_collections";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String ACCESS_KEY = "tm4rPHUHmWN_5-TK6YpcLl3pGKiIPyjyCUvky54WfPw";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String SECRET_KEY = "vOKdanz2ZP2MI1cD5REzL90upPubQ66i1cAxqjP702k";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String CALLBACK_URL = "school://kts.studio/callback";
    
    private AuthConfig() {
        super();
    }
}