package com.sample.practical.base;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b&\u0018\u00002\u00020\u00012\u00020\u0002B\u0005\u00a2\u0006\u0002\u0010\u0003J\b\u0010\n\u001a\u00020\u000bH\u0014J\b\u0010\f\u001a\u00020\rH&R\u001b\u0010\u0004\u001a\u00020\u00058DX\u0084\u0084\u0002\u00a2\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\u0006\u0010\u0007\u00a8\u0006\u000e"}, d2 = {"Lcom/sample/practical/base/BaseViewModel;", "Landroidx/lifecycle/ViewModel;", "Lorg/koin/core/KoinComponent;", "()V", "apiService", "Lcom/sample/practical/api/ApiService;", "getApiService", "()Lcom/sample/practical/api/ApiService;", "apiService$delegate", "Lkotlin/Lazy;", "onCleared", "", "provideState", "Lcom/sample/practical/base/BaseState;", "app_debug"})
public abstract class BaseViewModel extends androidx.lifecycle.ViewModel implements org.koin.core.KoinComponent {
    @org.jetbrains.annotations.NotNull()
    private final kotlin.Lazy apiService$delegate = null;
    
    @org.jetbrains.annotations.NotNull()
    public abstract com.sample.practical.base.BaseState provideState();
    
    @org.jetbrains.annotations.NotNull()
    protected final com.sample.practical.api.ApiService getApiService() {
        return null;
    }
    
    @java.lang.Override()
    protected void onCleared() {
    }
    
    public BaseViewModel() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public org.koin.core.Koin getKoin() {
        return null;
    }
}