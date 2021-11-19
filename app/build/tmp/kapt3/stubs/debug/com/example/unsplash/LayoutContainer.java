package com.example.unsplash;

import java.lang.System;

/**
 * A base interface for all view holders supporting Android Extensions-style view access.
 */
@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001R\u0014\u0010\u0002\u001a\u0004\u0018\u00010\u0003X\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005\u00a8\u0006\u0006"}, d2 = {"Lcom/example/unsplash/LayoutContainer;", "", "containerView", "Landroid/view/View;", "getContainerView", "()Landroid/view/View;", "app_debug"})
public abstract interface LayoutContainer {
    
    /**
     * Returns the root holder view.
     */
    @org.jetbrains.annotations.Nullable()
    public abstract android.view.View getContainerView();
}