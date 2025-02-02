package com.sample.practical.utils;

import java.lang.System;

/**
 * ClickEvent Listener for Adapter
 * Callback of click event
 */
@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\bf\u0018\u00002\u00020\u0001J\"\u0010\u0002\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u00052\u0006\u0010\u0006\u001a\u00020\u00012\u0006\u0010\u0007\u001a\u00020\bH&\u00a8\u0006\t"}, d2 = {"Lcom/sample/practical/utils/IAdapterOnClick;", "", "onClick", "", "view", "Landroid/view/View;", "item", "position", "", "app_debug"})
public abstract interface IAdapterOnClick {
    
    /**
     * Click event for getting callBack from adapter
     */
    public abstract void onClick(@org.jetbrains.annotations.Nullable()
    android.view.View view, @org.jetbrains.annotations.NotNull()
    java.lang.Object item, int position);
}