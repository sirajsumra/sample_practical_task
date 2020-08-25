package com.sample.practical.extension;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 2, d1 = {"\u00002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\u001a\u001e\u0010\u0004\u001a\u00020\u0005\"\n\b\u0000\u0010\u0006\u0018\u0001*\u00020\u0007*\u0002H\u0006H\u0086\b\u00a2\u0006\u0002\u0010\b\u001a\n\u0010\t\u001a\u00020\n*\u00020\u000b\u001a\"\u0010\f\u001a\u0002H\u0006\"\u0006\b\u0000\u0010\u0006\u0018\u0001*\u00020\u000b2\u0006\u0010\r\u001a\u00020\u0005H\u0086\n\u00a2\u0006\u0002\u0010\u000e\u001a\u0012\u0010\u000f\u001a\u00020\n*\u00020\u000b2\u0006\u0010\r\u001a\u00020\u0005\u001a$\u0010\u0010\u001a\u0004\u0018\u00010\u0011*\u00020\u000b2\u0006\u0010\r\u001a\u00020\u00052\u0006\u0010\u0012\u001a\u00020\u0007H\u0086\u0002\u00a2\u0006\u0002\u0010\u0013\u001a\u001c\u0010\u0014\u001a\u0004\u0018\u00010\u0015*\u00020\u000b2\u0006\u0010\r\u001a\u00020\u00052\u0006\u0010\u0012\u001a\u00020\u0007\"\u0011\u0010\u0000\u001a\u00020\u0001\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0002\u0010\u0003\u00a8\u0006\u0016"}, d2 = {"gson", "Lcom/google/gson/Gson;", "getGson", "()Lcom/google/gson/Gson;", "className", "", "T", "", "(Ljava/lang/Object;)Ljava/lang/String;", "clear", "", "Landroid/content/SharedPreferences;", "get", "key", "(Landroid/content/SharedPreferences;Ljava/lang/String;)Ljava/lang/Object;", "remove", "set", "", "value", "(Landroid/content/SharedPreferences;Ljava/lang/String;Ljava/lang/Object;)Ljava/lang/Boolean;", "write", "Landroid/content/SharedPreferences$Editor;", "app_debug"})
public final class PreferanceKt {
    @org.jetbrains.annotations.NotNull()
    private static final com.google.gson.Gson gson = null;
    
    @org.jetbrains.annotations.NotNull()
    public static final com.google.gson.Gson getGson() {
        return null;
    }
    
    /**
     * Extension to clear [SharedPreferences]
     */
    public static final void clear(@org.jetbrains.annotations.NotNull()
    android.content.SharedPreferences $this$clear) {
    }
    
    /**
     * Extension function to remove a key-value pair from [SharedPreferences]
     */
    public static final void remove(@org.jetbrains.annotations.NotNull()
    android.content.SharedPreferences $this$remove, @org.jetbrains.annotations.NotNull()
    java.lang.String key) {
    }
    
    /**
     * Extension function for [SharedPreferences] to modify it in asynchronously
     * @param key is the key for [SharedPreferences]
     * @param value is the data which will be stored into [SharedPreferences]
     */
    @org.jetbrains.annotations.Nullable()
    public static final android.content.SharedPreferences.Editor write(@org.jetbrains.annotations.NotNull()
    android.content.SharedPreferences $this$write, @org.jetbrains.annotations.NotNull()
    java.lang.String key, @org.jetbrains.annotations.NotNull()
    java.lang.Object value) {
        return null;
    }
    
    /**
     * Extension for set operator for [SharedPreferences] which will be
     * used to save data into [SharedPreferences]
     */
    @org.jetbrains.annotations.Nullable()
    public static final java.lang.Boolean set(@org.jetbrains.annotations.NotNull()
    android.content.SharedPreferences $this$set, @org.jetbrains.annotations.NotNull()
    java.lang.String key, @org.jetbrains.annotations.NotNull()
    java.lang.Object value) {
        return null;
    }
}