package com.sample.practical.base;

import java.lang.System;

/**
 * This class is base class for all recycler adapters
 */
@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0013\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\f\b&\u0018\u0000*\u0004\b\u0000\u0010\u00012\u0012\u0012\u000e\u0012\f0\u0003R\b\u0012\u0004\u0012\u0002H\u00010\u00000\u00022\u00020\u0004:\u0002OPB\u0005\u00a2\u0006\u0002\u0010\u0005J\u001e\u0010\u001a\u001a\u00020\u001b2\u0016\u0010\u001c\u001a\u0012\u0012\u0004\u0012\u00028\u00000\u0007j\b\u0012\u0004\u0012\u00028\u0000`\u001dJ\u0013\u0010\u001e\u001a\u00020\u001b2\u0006\u0010\u001f\u001a\u00028\u0000\u00a2\u0006\u0002\u0010 J\u001b\u0010!\u001a\u00020\u001b2\u0006\u0010\"\u001a\u00020\u00142\u0006\u0010\u001f\u001a\u00028\u0000\u00a2\u0006\u0002\u0010#J\u001e\u0010$\u001a\u00020\u001b2\u0016\u0010\u001c\u001a\u0012\u0012\u0004\u0012\u00028\u00000\u0007j\b\u0012\u0004\u0012\u00028\u0000`\u001dJ\u0006\u0010%\u001a\u00020\u001bJ\u001d\u0010&\u001a\u00020\'2\u0006\u0010(\u001a\u00028\u00002\u0006\u0010)\u001a\u00028\u0000H&\u00a2\u0006\u0002\u0010*J\u001d\u0010+\u001a\u00020\'2\u0006\u0010(\u001a\u00028\u00002\u0006\u0010)\u001a\u00028\u0000H&\u00a2\u0006\u0002\u0010*J\u0006\u0010,\u001a\u00020\u001bJ\b\u0010-\u001a\u00020.H\u0016J \u0010/\u001a\u0012\u0012\u0004\u0012\u00028\u00000\u0007j\b\u0012\u0004\u0012\u00028\u0000`\u001d2\u0006\u00100\u001a\u00020\u0012H\u0016J\b\u00101\u001a\u00020\u0014H\u0016J\u0010\u00102\u001a\u00020\u00142\u0006\u00103\u001a\u00020\u0014H\u0016J\u0010\u00104\u001a\u00020\u00142\u0006\u00105\u001a\u00020\u0014H\u0016J\u0010\u00106\u001a\u00020\u00142\u0006\u00105\u001a\u00020\u0014H&J\u0016\u00107\u001a\u0012\u0012\u0004\u0012\u00028\u00000\u0007j\b\u0012\u0004\u0012\u00028\u0000`\u001dJ\u000f\u00108\u001a\u0004\u0018\u00018\u0000H\u0014\u00a2\u0006\u0002\u00109J\u0010\u0010:\u001a\u00020\'2\u0006\u00103\u001a\u00020\u0014H\u0016J\b\u0010;\u001a\u00020\'H\u0016J\r\u0010<\u001a\u00020\'H\u0000\u00a2\u0006\u0002\b=J\"\u0010>\u001a\u00020\u001b2\u0010\u0010?\u001a\f0\u0003R\b\u0012\u0004\u0012\u00028\u00000\u00002\u0006\u00103\u001a\u00020\u0014H\u0016J\"\u0010@\u001a\f0\u0003R\b\u0012\u0004\u0012\u00028\u00000\u00002\u0006\u0010A\u001a\u00020B2\u0006\u00105\u001a\u00020\u0014H\u0016J\'\u0010C\u001a\u00020\u001b2\b\u0010D\u001a\u0004\u0018\u00010E2\u0006\u0010\u001f\u001a\u00028\u00002\u0006\u0010F\u001a\u00020\u0014H&\u00a2\u0006\u0002\u0010GJ\u0013\u0010H\u001a\u00020\u001b2\u0006\u0010\u001f\u001a\u00028\u0000\u00a2\u0006\u0002\u0010 J\u000e\u0010H\u001a\u00020\u001b2\u0006\u0010\"\u001a\u00020\u0014J\u0006\u0010I\u001a\u00020\u001bJ%\u0010J\u001a\u00020\u001b2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010K\u001a\u00028\u00002\u0006\u00103\u001a\u00020\u0014H\u0016\u00a2\u0006\u0002\u0010LJ\u001b\u0010M\u001a\u00020\u001b2\u0006\u0010\"\u001a\u00020\u00142\u0006\u0010\u001f\u001a\u00028\u0000\u00a2\u0006\u0002\u0010#J\u001e\u0010N\u001a\u00020\u001b2\u0016\u0010\u001c\u001a\u0012\u0012\u0004\u0012\u00028\u00000\u0007j\b\u0012\u0004\u0012\u00028\u0000`\u001dR\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00028\u00000\u0007X\u0084\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0014\u0010\n\u001a\b\u0012\u0004\u0012\u00028\u00000\u0007X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u001a\u0010\u000b\u001a\u00020\fX\u0084.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010R\u000e\u0010\u0011\u001a\u00020\u0012X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0013\u001a\u00020\u0014X\u0082D\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0015\u001a\u00020\u0014X\u0082D\u00a2\u0006\u0002\n\u0000R \u0010\u0016\u001a\b\u0012\u0004\u0012\u00028\u00000\u0007X\u0084\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0017\u0010\t\"\u0004\b\u0018\u0010\u0019\u00a8\u0006Q"}, d2 = {"Lcom/sample/practical/base/BaseRecyclerAdapter;", "T", "Landroidx/recyclerview/widget/RecyclerView$Adapter;", "Lcom/sample/practical/base/BaseRecyclerAdapter$RecyclerHolder;", "Landroid/widget/Filterable;", "()V", "arrayList", "Ljava/util/ArrayList;", "getArrayList", "()Ljava/util/ArrayList;", "arrayListFiltered", "binding", "Landroidx/databinding/ViewDataBinding;", "getBinding", "()Landroidx/databinding/ViewDataBinding;", "setBinding", "(Landroidx/databinding/ViewDataBinding;)V", "filteredText", "", "itemTypeLoader", "", "itemTypeNormal", "previousArrayList", "getPreviousArrayList", "setPreviousArrayList", "(Ljava/util/ArrayList;)V", "addAllItem", "", "newList", "Lkotlin/collections/ArrayList;", "addItem", "item", "(Ljava/lang/Object;)V", "addItemAt", "index", "(ILjava/lang/Object;)V", "addList", "addLoader", "areContentsTheSame", "", "oldItem", "newItem", "(Ljava/lang/Object;Ljava/lang/Object;)Z", "areItemsSame", "clearList", "getFilter", "Landroid/widget/Filter;", "getFilteredResults", "constraint", "getItemCount", "getItemViewType", "position", "getLayoutIdForLoading", "viewType", "getLayoutIdForType", "getListItems", "getLoaderItem", "()Ljava/lang/Object;", "isItemLoading", "isLastItemLoading", "isLoading", "isLoading$app_debug", "onBindViewHolder", "holder", "onCreateViewHolder", "parent", "Landroid/view/ViewGroup;", "onItemClick", "view", "Landroid/view/View;", "adapterPosition", "(Landroid/view/View;Ljava/lang/Object;I)V", "removeItem", "removeLoader", "setDataForListItem", "dataModel", "(Landroidx/databinding/ViewDataBinding;Ljava/lang/Object;I)V", "setItemAt", "setList", "BaseDiffUtil", "RecyclerHolder", "app_debug"})
public abstract class BaseRecyclerAdapter<T extends java.lang.Object> extends androidx.recyclerview.widget.RecyclerView.Adapter<com.sample.practical.base.BaseRecyclerAdapter<T>.RecyclerHolder> implements android.widget.Filterable {
    private java.util.ArrayList<T> arrayListFiltered;
    private final int itemTypeNormal = 1;
    private final int itemTypeLoader = 2;
    private java.lang.String filteredText = "";
    @org.jetbrains.annotations.NotNull()
    private final java.util.ArrayList<T> arrayList = null;
    @org.jetbrains.annotations.NotNull()
    private java.util.ArrayList<T> previousArrayList;
    @org.jetbrains.annotations.NotNull()
    protected androidx.databinding.ViewDataBinding binding;
    
    @org.jetbrains.annotations.NotNull()
    protected final java.util.ArrayList<T> getArrayList() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    protected final java.util.ArrayList<T> getPreviousArrayList() {
        return null;
    }
    
    protected final void setPreviousArrayList(@org.jetbrains.annotations.NotNull()
    java.util.ArrayList<T> p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    protected final androidx.databinding.ViewDataBinding getBinding() {
        return null;
    }
    
    protected final void setBinding(@org.jetbrains.annotations.NotNull()
    androidx.databinding.ViewDataBinding p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public com.sample.practical.base.BaseRecyclerAdapter<T>.RecyclerHolder onCreateViewHolder(@org.jetbrains.annotations.NotNull()
    android.view.ViewGroup parent, int viewType) {
        return null;
    }
    
    @java.lang.Override()
    public int getItemCount() {
        return 0;
    }
    
    @java.lang.Override()
    public int getItemViewType(int position) {
        return 0;
    }
    
    @java.lang.Override()
    public void onBindViewHolder(@org.jetbrains.annotations.NotNull()
    com.sample.practical.base.BaseRecyclerAdapter<T>.RecyclerHolder holder, int position) {
    }
    
    /**
     * This is abstract function used to get view type for adapter
     */
    public abstract int getLayoutIdForType(int viewType);
    
    /**
     * This fun is used to get layout for loader.
     * @param viewType Int
     * @return Int
     */
    public int getLayoutIdForLoading(int viewType) {
        return 0;
    }
    
    /**
     * This is abstract function used to get item click for all the adapter views
     */
    public abstract void onItemClick(@org.jetbrains.annotations.Nullable()
    android.view.View view, T item, int adapterPosition);
    
    /**
     * This is abstract function used to get set data for recycler list items.
     */
    public void setDataForListItem(@org.jetbrains.annotations.NotNull()
    androidx.databinding.ViewDataBinding binding, T dataModel, int position) {
    }
    
    /**
     * This fun is used to save list
     * @param newList ArrayList<T>
     */
    public final void setList(@org.jetbrains.annotations.NotNull()
    java.util.ArrayList<T> newList) {
    }
    
    /**
     * This fun is used to save list
     * @param newList ArrayList<T>
     */
    public final void addList(@org.jetbrains.annotations.NotNull()
    java.util.ArrayList<T> newList) {
    }
    
    /**
     * This fun is used to add all items in list
     * @param newList ArrayList<T>
     */
    public final void addAllItem(@org.jetbrains.annotations.NotNull()
    java.util.ArrayList<T> newList) {
    }
    
    /**
     * This fun is used to remove item from list
     * @param item T
     */
    public final void removeItem(T item) {
    }
    
    /**
     * This fun is used to add item
     * @param item T
     */
    public final void addItem(T item) {
    }
    
    /**
     * This fun is used to add item at specific position
     * @param index Int
     * @param item T
     */
    public final void addItemAt(int index, T item) {
    }
    
    /**
     * This fun is used to set item at specific position
     * @param index Int
     * @param item T
     */
    public final void setItemAt(int index, T item) {
    }
    
    /**
     * This fun is used to remove item from specific position
     * @param index Int
     */
    public final void removeItem(int index) {
    }
    
    /**
     * This class is used to get all data from adapter
     * @return ArrayList<T>
     */
    @org.jetbrains.annotations.NotNull()
    public final java.util.ArrayList<T> getListItems() {
        return null;
    }
    
    /**
     * This fun is used to clear list
     */
    public final void clearList() {
    }
    
    /**
     * This fun is used to get list item same or not.
     * @param oldItem T
     * @param newItem T
     * @return Boolean
     */
    public abstract boolean areItemsSame(T oldItem, T newItem);
    
    public abstract boolean areContentsTheSame(T oldItem, T newItem);
    
    /**
     * This fun is return loader item
     * @return T?
     */
    @org.jetbrains.annotations.Nullable()
    protected T getLoaderItem() {
        return null;
    }
    
    /**
     * This fun is used to add pagination loader.
     */
    public final void addLoader() {
    }
    
    /**
     * This fun is used to pagination remove loader
     */
    public final void removeLoader() {
    }
    
    /**
     * This fun is used to know item is loading or not.
     * @return Boolean
     */
    public final boolean isLoading$app_debug() {
        return false;
    }
    
    /**
     * This fun is used to returns that last item is loading or not
     * @return Boolean
     */
    public boolean isLastItemLoading() {
        return false;
    }
    
    /**
     * This fun is used to get particular item is loading or not.
     * @param position Int
     * @return Boolean
     */
    public boolean isItemLoading(int position) {
        return false;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public android.widget.Filter getFilter() {
        return null;
    }
    
    /**
     * This fun is used to get filtered result.
     * @param constraint String
     * @return ArrayList<T>
     */
    @org.jetbrains.annotations.NotNull()
    public java.util.ArrayList<T> getFilteredResults(@org.jetbrains.annotations.NotNull()
    java.lang.String constraint) {
        return null;
    }
    
    public BaseRecyclerAdapter() {
        super();
    }
    
    /**
     * This is inner class used to set recycler view holder.
     */
    @kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\b\u0086\u0004\u0018\u00002\u00020\u00012\u00020\u0002B\r\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u00a2\u0006\u0002\u0010\u0005J\u001b\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00028\u00002\u0006\u0010\t\u001a\u00020\n\u00a2\u0006\u0002\u0010\u000bJ\u0012\u0010\f\u001a\u00020\u00072\b\u0010\r\u001a\u0004\u0018\u00010\u000eH\u0016R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u000f"}, d2 = {"Lcom/sample/practical/base/BaseRecyclerAdapter$RecyclerHolder;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "Landroid/view/View$OnClickListener;", "viewDataBinding", "Landroidx/databinding/ViewDataBinding;", "(Lcom/sample/practical/base/BaseRecyclerAdapter;Landroidx/databinding/ViewDataBinding;)V", "bind", "", "dataModel", "position", "", "(Ljava/lang/Object;I)V", "onClick", "v", "Landroid/view/View;", "app_debug"})
    public final class RecyclerHolder extends androidx.recyclerview.widget.RecyclerView.ViewHolder implements android.view.View.OnClickListener {
        private final androidx.databinding.ViewDataBinding viewDataBinding = null;
        
        /**
         * This function is used to bind recycler data particular row wise.
         */
        public final void bind(T dataModel, int position) {
        }
        
        @java.lang.Override()
        public void onClick(@org.jetbrains.annotations.Nullable()
        android.view.View v) {
        }
        
        public RecyclerHolder(@org.jetbrains.annotations.NotNull()
        androidx.databinding.ViewDataBinding viewDataBinding) {
            super(null);
        }
    }
    
    /**
     * This class is used as diff util base class.
     * @property oldList ArrayList<T>
     * @property newList ArrayList<T>
     * @constructor
     */
    @kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\b\u0086\u0004\u0018\u00002\u00020\u0001B5\u0012\u0016\u0010\u0002\u001a\u0012\u0012\u0004\u0012\u00028\u00000\u0003j\b\u0012\u0004\u0012\u00028\u0000`\u0004\u0012\u0016\u0010\u0005\u001a\u0012\u0012\u0004\u0012\u00028\u00000\u0003j\b\u0012\u0004\u0012\u00028\u0000`\u0004\u00a2\u0006\u0002\u0010\u0006J\u0018\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\nH\u0016J\u0018\u0010\f\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\nH\u0016J\b\u0010\r\u001a\u00020\nH\u0016J\b\u0010\u000e\u001a\u00020\nH\u0016R\u001e\u0010\u0005\u001a\u0012\u0012\u0004\u0012\u00028\u00000\u0003j\b\u0012\u0004\u0012\u00028\u0000`\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001e\u0010\u0002\u001a\u0012\u0012\u0004\u0012\u00028\u00000\u0003j\b\u0012\u0004\u0012\u00028\u0000`\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u000f"}, d2 = {"Lcom/sample/practical/base/BaseRecyclerAdapter$BaseDiffUtil;", "Landroidx/recyclerview/widget/DiffUtil$Callback;", "oldList", "Ljava/util/ArrayList;", "Lkotlin/collections/ArrayList;", "newList", "(Lcom/sample/practical/base/BaseRecyclerAdapter;Ljava/util/ArrayList;Ljava/util/ArrayList;)V", "areContentsTheSame", "", "oldItemPosition", "", "newItemPosition", "areItemsTheSame", "getNewListSize", "getOldListSize", "app_debug"})
    public final class BaseDiffUtil extends androidx.recyclerview.widget.DiffUtil.Callback {
        private final java.util.ArrayList<T> oldList = null;
        private final java.util.ArrayList<T> newList = null;
        
        @java.lang.Override()
        public boolean areItemsTheSame(int oldItemPosition, int newItemPosition) {
            return false;
        }
        
        @java.lang.Override()
        public int getOldListSize() {
            return 0;
        }
        
        @java.lang.Override()
        public int getNewListSize() {
            return 0;
        }
        
        @java.lang.Override()
        public boolean areContentsTheSame(int oldItemPosition, int newItemPosition) {
            return false;
        }
        
        public BaseDiffUtil(@org.jetbrains.annotations.NotNull()
        java.util.ArrayList<T> oldList, @org.jetbrains.annotations.NotNull()
        java.util.ArrayList<T> newList) {
            super();
        }
    }
}