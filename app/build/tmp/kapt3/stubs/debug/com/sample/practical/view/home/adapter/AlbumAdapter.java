package com.sample.practical.view.home.adapter;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\r\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u00a2\u0006\u0002\u0010\u0005J\u0018\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\u00022\u0006\u0010\t\u001a\u00020\u0002H\u0016J\u0018\u0010\n\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\u00022\u0006\u0010\t\u001a\u00020\u0002H\u0016J\u0010\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\fH\u0016J\"\u0010\u000e\u001a\u00020\u000f2\u0010\u0010\u0010\u001a\f0\u0011R\b\u0012\u0004\u0012\u00020\u00020\u00012\u0006\u0010\u0012\u001a\u00020\fH\u0016J\"\u0010\u0013\u001a\u00020\u000f2\b\u0010\u0014\u001a\u0004\u0018\u00010\u00152\u0006\u0010\u0016\u001a\u00020\u00022\u0006\u0010\u0017\u001a\u00020\fH\u0016R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0018"}, d2 = {"Lcom/sample/practical/view/home/adapter/AlbumAdapter;", "Lcom/sample/practical/base/BaseRecyclerAdapter;", "Lcom/sample/practical/model/AlbumData;", "listener", "Lcom/sample/practical/utils/IAdapterOnClick;", "(Lcom/sample/practical/utils/IAdapterOnClick;)V", "areContentsTheSame", "", "oldItem", "newItem", "areItemsSame", "getLayoutIdForType", "", "viewType", "onBindViewHolder", "", "holder", "Lcom/sample/practical/base/BaseRecyclerAdapter$RecyclerHolder;", "position", "onItemClick", "view", "Landroid/view/View;", "item", "adapterPosition", "app_debug"})
public final class AlbumAdapter extends com.sample.practical.base.BaseRecyclerAdapter<com.sample.practical.model.AlbumData> {
    private final com.sample.practical.utils.IAdapterOnClick listener = null;
    
    @java.lang.Override()
    public int getLayoutIdForType(int viewType) {
        return 0;
    }
    
    @java.lang.Override()
    public void onBindViewHolder(@org.jetbrains.annotations.NotNull()
    com.sample.practical.base.BaseRecyclerAdapter<com.sample.practical.model.AlbumData>.RecyclerHolder holder, int position) {
    }
    
    @java.lang.Override()
    public boolean areItemsSame(@org.jetbrains.annotations.NotNull()
    com.sample.practical.model.AlbumData oldItem, @org.jetbrains.annotations.NotNull()
    com.sample.practical.model.AlbumData newItem) {
        return false;
    }
    
    @java.lang.Override()
    public void onItemClick(@org.jetbrains.annotations.Nullable()
    android.view.View view, @org.jetbrains.annotations.NotNull()
    com.sample.practical.model.AlbumData item, int adapterPosition) {
    }
    
    @java.lang.Override()
    public boolean areContentsTheSame(@org.jetbrains.annotations.NotNull()
    com.sample.practical.model.AlbumData oldItem, @org.jetbrains.annotations.NotNull()
    com.sample.practical.model.AlbumData newItem) {
        return false;
    }
    
    public AlbumAdapter(@org.jetbrains.annotations.NotNull()
    com.sample.practical.utils.IAdapterOnClick listener) {
        super();
    }
}