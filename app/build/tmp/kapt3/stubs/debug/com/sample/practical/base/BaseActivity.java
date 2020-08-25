package com.sample.practical.base;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\b&\u0018\u0000*\b\b\u0000\u0010\u0001*\u00020\u0002*\b\b\u0001\u0010\u0003*\u00020\u0004*\b\b\u0002\u0010\u0005*\u00020\u00062\u00020\u0007B\u000f\u0012\b\b\u0001\u0010\b\u001a\u00020\t\u00a2\u0006\u0002\u0010\nJ\b\u0010 \u001a\u00020!H\u0002J\u0015\u0010\"\u001a\u00020!2\u0006\u0010\u0019\u001a\u00028\u0001H&\u00a2\u0006\u0002\u0010#J\u0012\u0010$\u001a\u00020!2\b\u0010%\u001a\u0004\u0018\u00010&H\u0014J\u0010\u0010\'\u001a\u00020!2\b\b\u0001\u0010(\u001a\u00020\tJ\u0018\u0010\'\u001a\u00020!2\u0006\u0010(\u001a\u00020)2\b\b\u0002\u0010*\u001a\u00020\tR\u001c\u0010\u000b\u001a\u00028\u0000X\u0084.\u00a2\u0006\u0010\n\u0002\u0010\u0010\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000fR\u001b\u0010\u0011\u001a\u00020\u00128DX\u0084\u0084\u0002\u00a2\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0013\u0010\u0014R\u0011\u0010\b\u001a\u00020\t\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018R\u001b\u0010\u0019\u001a\u00028\u00018DX\u0084\u0084\u0002\u00a2\u0006\f\n\u0004\b\u001c\u0010\u0016\u001a\u0004\b\u001a\u0010\u001bR\u0012\u0010\u001d\u001a\u00028\u0002X\u00a4\u0004\u00a2\u0006\u0006\u001a\u0004\b\u001e\u0010\u001f\u00a8\u0006+"}, d2 = {"Lcom/sample/practical/base/BaseActivity;", "BINDING", "Landroidx/databinding/ViewDataBinding;", "STATE", "Lcom/sample/practical/base/BaseState;", "VIEWMODEL", "Lcom/sample/practical/base/BaseViewModel;", "Landroidx/appcompat/app/AppCompatActivity;", "layoutId", "", "(I)V", "binding", "getBinding", "()Landroidx/databinding/ViewDataBinding;", "setBinding", "(Landroidx/databinding/ViewDataBinding;)V", "Landroidx/databinding/ViewDataBinding;", "defaultPref", "Lcom/sample/practical/preferances/DefaultPreference;", "getDefaultPref", "()Lcom/sample/practical/preferances/DefaultPreference;", "defaultPref$delegate", "Lkotlin/Lazy;", "getLayoutId", "()I", "state", "getState", "()Lcom/sample/practical/base/BaseState;", "state$delegate", "viewModel", "getViewModel", "()Lcom/sample/practical/base/BaseViewModel;", "initilizeBinding", "", "observeViewStat", "(Lcom/sample/practical/base/BaseState;)V", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "toast", "message", "", "duration", "app_debug"})
public abstract class BaseActivity<BINDING extends androidx.databinding.ViewDataBinding, STATE extends com.sample.practical.base.BaseState, VIEWMODEL extends com.sample.practical.base.BaseViewModel> extends androidx.appcompat.app.AppCompatActivity {
    @org.jetbrains.annotations.NotNull()
    private final kotlin.Lazy defaultPref$delegate = null;
    @org.jetbrains.annotations.NotNull()
    private final kotlin.Lazy state$delegate = null;
    @org.jetbrains.annotations.NotNull()
    protected BINDING binding;
    private final int layoutId = 0;
    private java.util.HashMap _$_findViewCache;
    
    @org.jetbrains.annotations.NotNull()
    protected final com.sample.practical.preferances.DefaultPreference getDefaultPref() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    protected abstract VIEWMODEL getViewModel();
    
    @org.jetbrains.annotations.NotNull()
    protected final STATE getState() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    protected final BINDING getBinding() {
        return null;
    }
    
    protected final void setBinding(@org.jetbrains.annotations.NotNull()
    BINDING p0) {
    }
    
    @java.lang.Override()
    protected void onCreate(@org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
    }
    
    /**
     * initilize databinding
     */
    private final void initilizeBinding() {
    }
    
    public abstract void observeViewStat(@org.jetbrains.annotations.NotNull()
    STATE state);
    
    /**
     * Display Toast
     * @param message String
     * @param duration Int
     */
    public final void toast(@org.jetbrains.annotations.NotNull()
    java.lang.String message, int duration) {
    }
    
    /**
     * Display Toast
     * @param message Int : String resource ID
     */
    public final void toast(@androidx.annotation.StringRes()
    int message) {
    }
    
    public final int getLayoutId() {
        return 0;
    }
    
    public BaseActivity(@androidx.annotation.LayoutRes()
    int layoutId) {
        super();
    }
}