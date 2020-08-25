package com.sample.practical.view.home;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u00012\u00020\u0005B\u0005\u00a2\u0006\u0002\u0010\u0006J\u0010\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u0003H\u0016J\"\u0010\u0019\u001a\u00020\u00172\b\u0010\u001a\u001a\u0004\u0018\u00010\u001b2\u0006\u0010\u001c\u001a\u00020\u001d2\u0006\u0010\u001e\u001a\u00020\u001fH\u0016J\u0012\u0010 \u001a\u00020!2\b\u0010\"\u001a\u0004\u0018\u00010#H\u0016J\u0010\u0010$\u001a\u00020!2\u0006\u0010\u001c\u001a\u00020%H\u0016J\b\u0010&\u001a\u00020\u0017H\u0002R\u001a\u0010\u0007\u001a\u00020\bX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\t\u0010\n\"\u0004\b\u000b\u0010\fR\"\u0010\r\u001a\u0016\u0012\u0004\u0012\u00020\u000f\u0018\u00010\u000ej\n\u0012\u0004\u0012\u00020\u000f\u0018\u0001`\u0010X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u001b\u0010\u0011\u001a\u00020\u00048TX\u0094\u0084\u0002\u00a2\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0012\u0010\u0013\u00a8\u0006\'"}, d2 = {"Lcom/sample/practical/view/home/HomeActivity;", "Lcom/sample/practical/base/BaseActivity;", "Lcom/sample/practical/databinding/ActivityHomeBinding;", "Lcom/sample/practical/view/home/HomeActivityState;", "Lcom/sample/practical/view/home/HomeActivityViewModel;", "Lcom/sample/practical/utils/IAdapterOnClick;", "()V", "listAdapter", "Lcom/sample/practical/view/home/adapter/AlbumAdapter;", "getListAdapter", "()Lcom/sample/practical/view/home/adapter/AlbumAdapter;", "setListAdapter", "(Lcom/sample/practical/view/home/adapter/AlbumAdapter;)V", "listData", "Ljava/util/ArrayList;", "Lcom/sample/practical/model/AlbumData;", "Lkotlin/collections/ArrayList;", "viewModel", "getViewModel", "()Lcom/sample/practical/view/home/HomeActivityViewModel;", "viewModel$delegate", "Lkotlin/Lazy;", "observeViewStat", "", "state", "onClick", "view", "Landroid/view/View;", "item", "", "position", "", "onCreateOptionsMenu", "", "menu", "Landroid/view/Menu;", "onOptionsItemSelected", "Landroid/view/MenuItem;", "openAlertForLogout", "app_debug"})
public final class HomeActivity extends com.sample.practical.base.BaseActivity<com.sample.practical.databinding.ActivityHomeBinding, com.sample.practical.view.home.HomeActivityState, com.sample.practical.view.home.HomeActivityViewModel> implements com.sample.practical.utils.IAdapterOnClick {
    @org.jetbrains.annotations.NotNull()
    private final kotlin.Lazy viewModel$delegate = null;
    @org.jetbrains.annotations.NotNull()
    private com.sample.practical.view.home.adapter.AlbumAdapter listAdapter;
    private java.util.ArrayList<com.sample.practical.model.AlbumData> listData;
    private java.util.HashMap _$_findViewCache;
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    protected com.sample.practical.view.home.HomeActivityViewModel getViewModel() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.sample.practical.view.home.adapter.AlbumAdapter getListAdapter() {
        return null;
    }
    
    public final void setListAdapter(@org.jetbrains.annotations.NotNull()
    com.sample.practical.view.home.adapter.AlbumAdapter p0) {
    }
    
    @java.lang.Override()
    public boolean onCreateOptionsMenu(@org.jetbrains.annotations.Nullable()
    android.view.Menu menu) {
        return false;
    }
    
    @java.lang.Override()
    public boolean onOptionsItemSelected(@org.jetbrains.annotations.NotNull()
    android.view.MenuItem item) {
        return false;
    }
    
    private final void openAlertForLogout() {
    }
    
    @java.lang.Override()
    public void observeViewStat(@org.jetbrains.annotations.NotNull()
    com.sample.practical.view.home.HomeActivityState state) {
    }
    
    @java.lang.Override()
    public void onClick(@org.jetbrains.annotations.Nullable()
    android.view.View view, @org.jetbrains.annotations.NotNull()
    java.lang.Object item, int position) {
    }
    
    public HomeActivity() {
        super(0);
    }
}