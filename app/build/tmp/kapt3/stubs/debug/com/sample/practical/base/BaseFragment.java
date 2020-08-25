package com.sample.practical.base;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0013\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b&\u0018\u0000*\b\b\u0000\u0010\u0001*\u00020\u0002*\b\b\u0001\u0010\u0003*\u00020\u0004*\b\b\u0002\u0010\u0005*\u00020\u00062\u00020\u0007B\u000f\u0012\b\b\u0001\u0010\b\u001a\u00020\t\u00a2\u0006\u0002\u0010\nJ\u001f\u0010\u001b\u001a\u00028\u00002\u0006\u0010\u001c\u001a\u00020\u001d2\b\u0010\u001e\u001a\u0004\u0018\u00010\u001fH\u0002\u00a2\u0006\u0002\u0010 J\u0015\u0010!\u001a\u00020\"2\u0006\u0010\u0013\u001a\u00028\u0001H&\u00a2\u0006\u0002\u0010#J\u0012\u0010$\u001a\u00020\"2\b\u0010%\u001a\u0004\u0018\u00010&H\u0016J&\u0010\'\u001a\u0004\u0018\u00010(2\u0006\u0010\u001c\u001a\u00020\u001d2\b\u0010\u001e\u001a\u0004\u0018\u00010\u001f2\b\u0010%\u001a\u0004\u0018\u00010&H\u0016R\u001c\u0010\u000b\u001a\u00028\u0000X\u0084.\u00a2\u0006\u0010\n\u0002\u0010\u0010\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000fR\u0011\u0010\b\u001a\u00020\t\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u001b\u0010\u0013\u001a\u00028\u00018DX\u0084\u0084\u0002\u00a2\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0014\u0010\u0015R\u0012\u0010\u0018\u001a\u00028\u0002X\u00a4\u0004\u00a2\u0006\u0006\u001a\u0004\b\u0019\u0010\u001a\u00a8\u0006)"}, d2 = {"Lcom/sample/practical/base/BaseFragment;", "BINDING", "Landroidx/databinding/ViewDataBinding;", "STATE", "Lcom/sample/practical/base/BaseState;", "VIEWMODEL", "Lcom/sample/practical/base/BaseViewModel;", "Landroidx/fragment/app/Fragment;", "layoutId", "", "(I)V", "binding", "getBinding", "()Landroidx/databinding/ViewDataBinding;", "setBinding", "(Landroidx/databinding/ViewDataBinding;)V", "Landroidx/databinding/ViewDataBinding;", "getLayoutId", "()I", "state", "getState", "()Lcom/sample/practical/base/BaseState;", "state$delegate", "Lkotlin/Lazy;", "viewModel", "getViewModel", "()Lcom/sample/practical/base/BaseViewModel;", "initializeDataBinding", "inflater", "Landroid/view/LayoutInflater;", "container", "Landroid/view/ViewGroup;", "(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;)Landroidx/databinding/ViewDataBinding;", "observeViewState", "", "(Lcom/sample/practical/base/BaseState;)V", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "onCreateView", "Landroid/view/View;", "app_debug"})
public abstract class BaseFragment<BINDING extends androidx.databinding.ViewDataBinding, STATE extends com.sample.practical.base.BaseState, VIEWMODEL extends com.sample.practical.base.BaseViewModel> extends androidx.fragment.app.Fragment {
    @org.jetbrains.annotations.NotNull()
    protected BINDING binding;
    @org.jetbrains.annotations.NotNull()
    private final kotlin.Lazy state$delegate = null;
    private final int layoutId = 0;
    private java.util.HashMap _$_findViewCache;
    
    @org.jetbrains.annotations.NotNull()
    protected abstract VIEWMODEL getViewModel();
    
    @org.jetbrains.annotations.NotNull()
    protected final BINDING getBinding() {
        return null;
    }
    
    protected final void setBinding(@org.jetbrains.annotations.NotNull()
    BINDING p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    protected final STATE getState() {
        return null;
    }
    
    @java.lang.Override()
    public void onCreate(@org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
    }
    
    @org.jetbrains.annotations.Nullable()
    @java.lang.Override()
    public android.view.View onCreateView(@org.jetbrains.annotations.NotNull()
    android.view.LayoutInflater inflater, @org.jetbrains.annotations.Nullable()
    android.view.ViewGroup container, @org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
        return null;
    }
    
    private final BINDING initializeDataBinding(android.view.LayoutInflater inflater, android.view.ViewGroup container) {
        return null;
    }
    
    public abstract void observeViewState(@org.jetbrains.annotations.NotNull()
    STATE state);
    
    public final int getLayoutId() {
        return 0;
    }
    
    public BaseFragment(@androidx.annotation.LayoutRes()
    int layoutId) {
        super();
    }
}