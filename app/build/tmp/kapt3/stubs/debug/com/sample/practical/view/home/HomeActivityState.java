package com.sample.practical.view.home;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\u0018\u00002\u00020\u0001:\u0002\u000e\u000fB\u0005\u00a2\u0006\u0002\u0010\u0002R\u0017\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u001d\u0010\b\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\n0\t0\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\u0007R\u0017\u0010\f\u001a\b\u0012\u0004\u0012\u00020\r0\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\f\u0010\u0007\u00a8\u0006\u0010"}, d2 = {"Lcom/sample/practical/view/home/HomeActivityState;", "Lcom/sample/practical/base/BaseState;", "()V", "albumAPIState", "Landroidx/lifecycle/MutableLiveData;", "Lcom/sample/practical/view/home/HomeActivityState$AlbumResponse;", "getAlbumAPIState", "()Landroidx/lifecycle/MutableLiveData;", "data", "Ljava/util/ArrayList;", "Lcom/sample/practical/model/AlbumData;", "getData", "isLoading", "", "AlbumResponse", "ClickEvent", "app_debug"})
public final class HomeActivityState implements com.sample.practical.base.BaseState {
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.MutableLiveData<java.lang.Boolean> isLoading = null;
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.MutableLiveData<java.util.ArrayList<com.sample.practical.model.AlbumData>> data = null;
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.MutableLiveData<com.sample.practical.view.home.HomeActivityState.AlbumResponse> albumAPIState = null;
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.MutableLiveData<java.lang.Boolean> isLoading() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.MutableLiveData<java.util.ArrayList<com.sample.practical.model.AlbumData>> getData() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.MutableLiveData<com.sample.practical.view.home.HomeActivityState.AlbumResponse> getAlbumAPIState() {
        return null;
    }
    
    public HomeActivityState() {
        super();
    }
    
    /**
     * Comments API State
     */
    @kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0003\u0003\u0004\u0005B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002\u0082\u0001\u0003\u0006\u0007\b\u00a8\u0006\t"}, d2 = {"Lcom/sample/practical/view/home/HomeActivityState$AlbumResponse;", "", "()V", "Failure", "Loading", "Success", "Lcom/sample/practical/view/home/HomeActivityState$AlbumResponse$Loading;", "Lcom/sample/practical/view/home/HomeActivityState$AlbumResponse$Success;", "Lcom/sample/practical/view/home/HomeActivityState$AlbumResponse$Failure;", "app_debug"})
    public static abstract class AlbumResponse {
        
        private AlbumResponse() {
            super();
        }
        
        @kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002\u00a8\u0006\u0003"}, d2 = {"Lcom/sample/practical/view/home/HomeActivityState$AlbumResponse$Loading;", "Lcom/sample/practical/view/home/HomeActivityState$AlbumResponse;", "()V", "app_debug"})
        public static final class Loading extends com.sample.practical.view.home.HomeActivityState.AlbumResponse {
            public static final com.sample.practical.view.home.HomeActivityState.AlbumResponse.Loading INSTANCE = null;
            
            private Loading() {
                super();
            }
        }
        
        @kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u001d\u0012\u0016\u0010\u0002\u001a\u0012\u0012\u0004\u0012\u00020\u00040\u0003j\b\u0012\u0004\u0012\u00020\u0004`\u0005\u00a2\u0006\u0002\u0010\u0006J\u0019\u0010\t\u001a\u0012\u0012\u0004\u0012\u00020\u00040\u0003j\b\u0012\u0004\u0012\u00020\u0004`\u0005H\u00c6\u0003J#\u0010\n\u001a\u00020\u00002\u0018\b\u0002\u0010\u0002\u001a\u0012\u0012\u0004\u0012\u00020\u00040\u0003j\b\u0012\u0004\u0012\u00020\u0004`\u0005H\u00c6\u0001J\u0013\u0010\u000b\u001a\u00020\f2\b\u0010\r\u001a\u0004\u0018\u00010\u000eH\u00d6\u0003J\t\u0010\u000f\u001a\u00020\u0010H\u00d6\u0001J\t\u0010\u0011\u001a\u00020\u0012H\u00d6\u0001R!\u0010\u0002\u001a\u0012\u0012\u0004\u0012\u00020\u00040\u0003j\b\u0012\u0004\u0012\u00020\u0004`\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\b\u00a8\u0006\u0013"}, d2 = {"Lcom/sample/practical/view/home/HomeActivityState$AlbumResponse$Success;", "Lcom/sample/practical/view/home/HomeActivityState$AlbumResponse;", "data", "Ljava/util/ArrayList;", "Lcom/sample/practical/model/AlbumData;", "Lkotlin/collections/ArrayList;", "(Ljava/util/ArrayList;)V", "getData", "()Ljava/util/ArrayList;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "app_debug"})
        public static final class Success extends com.sample.practical.view.home.HomeActivityState.AlbumResponse {
            @org.jetbrains.annotations.NotNull()
            private final java.util.ArrayList<com.sample.practical.model.AlbumData> data = null;
            
            @org.jetbrains.annotations.NotNull()
            public final java.util.ArrayList<com.sample.practical.model.AlbumData> getData() {
                return null;
            }
            
            public Success(@org.jetbrains.annotations.NotNull()
            java.util.ArrayList<com.sample.practical.model.AlbumData> data) {
                super();
            }
            
            @org.jetbrains.annotations.NotNull()
            public final java.util.ArrayList<com.sample.practical.model.AlbumData> component1() {
                return null;
            }
            
            @org.jetbrains.annotations.NotNull()
            public final com.sample.practical.view.home.HomeActivityState.AlbumResponse.Success copy(@org.jetbrains.annotations.NotNull()
            java.util.ArrayList<com.sample.practical.model.AlbumData> data) {
                return null;
            }
            
            @org.jetbrains.annotations.NotNull()
            @java.lang.Override()
            public java.lang.String toString() {
                return null;
            }
            
            @java.lang.Override()
            public int hashCode() {
                return 0;
            }
            
            @java.lang.Override()
            public boolean equals(@org.jetbrains.annotations.Nullable()
            java.lang.Object p0) {
                return false;
            }
        }
        
        @kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\t\u0010\u0007\u001a\u00020\u0003H\u00c6\u0003J\u0013\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003H\u00c6\u0001J\u0013\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\fH\u00d6\u0003J\t\u0010\r\u001a\u00020\u000eH\u00d6\u0001J\t\u0010\u000f\u001a\u00020\u0010H\u00d6\u0001R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006\u00a8\u0006\u0011"}, d2 = {"Lcom/sample/practical/view/home/HomeActivityState$AlbumResponse$Failure;", "Lcom/sample/practical/view/home/HomeActivityState$AlbumResponse;", "throwable", "", "(Ljava/lang/Throwable;)V", "getThrowable", "()Ljava/lang/Throwable;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "app_debug"})
        public static final class Failure extends com.sample.practical.view.home.HomeActivityState.AlbumResponse {
            @org.jetbrains.annotations.NotNull()
            private final java.lang.Throwable throwable = null;
            
            @org.jetbrains.annotations.NotNull()
            public final java.lang.Throwable getThrowable() {
                return null;
            }
            
            public Failure(@org.jetbrains.annotations.NotNull()
            java.lang.Throwable throwable) {
                super();
            }
            
            @org.jetbrains.annotations.NotNull()
            public final java.lang.Throwable component1() {
                return null;
            }
            
            @org.jetbrains.annotations.NotNull()
            public final com.sample.practical.view.home.HomeActivityState.AlbumResponse.Failure copy(@org.jetbrains.annotations.NotNull()
            java.lang.Throwable throwable) {
                return null;
            }
            
            @org.jetbrains.annotations.NotNull()
            @java.lang.Override()
            public java.lang.String toString() {
                return null;
            }
            
            @java.lang.Override()
            public int hashCode() {
                return 0;
            }
            
            @java.lang.Override()
            public boolean equals(@org.jetbrains.annotations.Nullable()
            java.lang.Object p0) {
                return false;
            }
        }
    }
    
    @kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0002\u0003\u0004B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002\u0082\u0001\u0002\u0005\u0006\u00a8\u0006\u0007"}, d2 = {"Lcom/sample/practical/view/home/HomeActivityState$ClickEvent;", "", "()V", "articalDescClicked", "articalImageClicked", "Lcom/sample/practical/view/home/HomeActivityState$ClickEvent$articalImageClicked;", "Lcom/sample/practical/view/home/HomeActivityState$ClickEvent$articalDescClicked;", "app_debug"})
    public static abstract class ClickEvent {
        
        private ClickEvent() {
            super();
        }
        
        @kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002\u00a8\u0006\u0003"}, d2 = {"Lcom/sample/practical/view/home/HomeActivityState$ClickEvent$articalImageClicked;", "Lcom/sample/practical/view/home/HomeActivityState$ClickEvent;", "()V", "app_debug"})
        public static final class articalImageClicked extends com.sample.practical.view.home.HomeActivityState.ClickEvent {
            public static final com.sample.practical.view.home.HomeActivityState.ClickEvent.articalImageClicked INSTANCE = null;
            
            private articalImageClicked() {
                super();
            }
        }
        
        @kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002\u00a8\u0006\u0003"}, d2 = {"Lcom/sample/practical/view/home/HomeActivityState$ClickEvent$articalDescClicked;", "Lcom/sample/practical/view/home/HomeActivityState$ClickEvent;", "()V", "app_debug"})
        public static final class articalDescClicked extends com.sample.practical.view.home.HomeActivityState.ClickEvent {
            public static final com.sample.practical.view.home.HomeActivityState.ClickEvent.articalDescClicked INSTANCE = null;
            
            private articalDescClicked() {
                super();
            }
        }
    }
}