package com.sample.practical.preferances;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0004\b&\u0018\u00002\u00020\u00012\u00020\u0002B\u0005\u00a2\u0006\u0002\u0010\u0003J\b\u0010\u0012\u001a\u00020\u0013H\u0004J\u0010\u0010\u0014\u001a\u00020\u00132\u0006\u0010\b\u001a\u00020\tH&J\u001c\u0010\u0015\u001a\u00020\u00132\b\u0010\u0016\u001a\u0004\u0018\u00010\r2\b\u0010\b\u001a\u0004\u0018\u00010\tH\u0016R\u0014\u0010\u0004\u001a\u00020\u0005X\u0084\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0012\u0010\b\u001a\u00020\tX\u00a4\u0004\u00a2\u0006\u0006\u001a\u0004\b\n\u0010\u000bR\u001b\u0010\f\u001a\u00020\r8FX\u0086\u0084\u0002\u00a2\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u000e\u0010\u000f\u00a8\u0006\u0017"}, d2 = {"Lcom/sample/practical/preferances/BasePrefrence;", "Lorg/koin/core/KoinComponent;", "Landroid/content/SharedPreferences$OnSharedPreferenceChangeListener;", "()V", "gson", "Lcom/google/gson/Gson;", "getGson", "()Lcom/google/gson/Gson;", "key", "", "getKey", "()Ljava/lang/String;", "pref", "Landroid/content/SharedPreferences;", "getPref", "()Landroid/content/SharedPreferences;", "pref$delegate", "Lkotlin/Lazy;", "clear", "", "onPreferenceChanged", "onSharedPreferenceChanged", "sharedPreferences", "app_debug"})
public abstract class BasePrefrence implements org.koin.core.KoinComponent, android.content.SharedPreferences.OnSharedPreferenceChangeListener {
    @org.jetbrains.annotations.NotNull()
    private final kotlin.Lazy pref$delegate = null;
    @org.jetbrains.annotations.NotNull()
    private final com.google.gson.Gson gson = null;
    
    @org.jetbrains.annotations.NotNull()
    public final android.content.SharedPreferences getPref() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    protected final com.google.gson.Gson getGson() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    protected abstract java.lang.String getKey();
    
    /**
     * This function will be called on preference changes
     * @param key is the key of changed busData
     */
    public abstract void onPreferenceChanged(@org.jetbrains.annotations.NotNull()
    java.lang.String key);
    
    protected final void clear() {
    }
    
    @java.lang.Override()
    public void onSharedPreferenceChanged(@org.jetbrains.annotations.Nullable()
    android.content.SharedPreferences sharedPreferences, @org.jetbrains.annotations.Nullable()
    java.lang.String key) {
    }
    
    public BasePrefrence() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public org.koin.core.Koin getKoin() {
        return null;
    }
}