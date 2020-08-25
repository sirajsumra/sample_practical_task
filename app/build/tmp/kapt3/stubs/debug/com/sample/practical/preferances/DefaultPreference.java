package com.sample.practical.preferances;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\u0010\u0010\r\u001a\u00020\u000e2\u0006\u0010\t\u001a\u00020\nH\u0016J\u0006\u0010\u000f\u001a\u00020\u000eJ\b\u0010\u0010\u001a\u00020\u000eH\u0002R\u001a\u0010\u0003\u001a\u00020\u0004X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\u0014\u0010\t\u001a\u00020\nX\u0094\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\f\u00a8\u0006\u0011"}, d2 = {"Lcom/sample/practical/preferances/DefaultPreference;", "Lcom/sample/practical/preferances/BasePrefrence;", "()V", "data", "Lcom/sample/practical/preferances/NormalPreference;", "getData", "()Lcom/sample/practical/preferances/NormalPreference;", "setData", "(Lcom/sample/practical/preferances/NormalPreference;)V", "key", "", "getKey", "()Ljava/lang/String;", "onPreferenceChanged", "", "store", "update", "app_debug"})
public final class DefaultPreference extends com.sample.practical.preferances.BasePrefrence {
    @org.jetbrains.annotations.NotNull()
    private com.sample.practical.preferances.NormalPreference data;
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String key = null;
    
    @org.jetbrains.annotations.NotNull()
    public final com.sample.practical.preferances.NormalPreference getData() {
        return null;
    }
    
    public final void setData(@org.jetbrains.annotations.NotNull()
    com.sample.practical.preferances.NormalPreference p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    protected java.lang.String getKey() {
        return null;
    }
    
    /**
     * Created by Simform Solutions on 27 February 2020.
     */
    @java.lang.Override()
    public void onPreferenceChanged(@org.jetbrains.annotations.NotNull()
    java.lang.String key) {
    }
    
    /**
     * Stores [DefaultPreference] into SharedPreferences
     */
    public final void store() {
    }
    
    private final void update() {
    }
    
    public DefaultPreference() {
        super();
    }
}