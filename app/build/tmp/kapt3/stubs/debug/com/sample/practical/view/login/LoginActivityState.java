package com.sample.practical.view.login;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001:\u0001\u0013B\u0005\u00a2\u0006\u0002\u0010\u0002R\u0017\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R \u0010\b\u001a\b\u0012\u0004\u0012\u00020\t0\u0004X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u0007\"\u0004\b\u000b\u0010\fR \u0010\r\u001a\b\u0012\u0004\u0012\u00020\t0\u0004X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\u0007\"\u0004\b\u000f\u0010\fR\u0017\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00110\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0007\u00a8\u0006\u0014"}, d2 = {"Lcom/sample/practical/view/login/LoginActivityState;", "Lcom/sample/practical/base/BaseState;", "()V", "clickEvent", "Landroidx/lifecycle/MutableLiveData;", "Lcom/sample/practical/view/login/ClickEvent;", "getClickEvent", "()Landroidx/lifecycle/MutableLiveData;", "email", "", "getEmail", "setEmail", "(Landroidx/lifecycle/MutableLiveData;)V", "password", "getPassword", "setPassword", "validationLiveData", "Lcom/sample/practical/view/login/LoginActivityState$ErrorMessage;", "getValidationLiveData", "ErrorMessage", "app_debug"})
public final class LoginActivityState implements com.sample.practical.base.BaseState {
    @org.jetbrains.annotations.NotNull()
    private androidx.lifecycle.MutableLiveData<java.lang.String> email;
    @org.jetbrains.annotations.NotNull()
    private androidx.lifecycle.MutableLiveData<java.lang.String> password;
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.MutableLiveData<com.sample.practical.view.login.LoginActivityState.ErrorMessage> validationLiveData = null;
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.MutableLiveData<com.sample.practical.view.login.ClickEvent> clickEvent = null;
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.MutableLiveData<java.lang.String> getEmail() {
        return null;
    }
    
    public final void setEmail(@org.jetbrains.annotations.NotNull()
    androidx.lifecycle.MutableLiveData<java.lang.String> p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.MutableLiveData<java.lang.String> getPassword() {
        return null;
    }
    
    public final void setPassword(@org.jetbrains.annotations.NotNull()
    androidx.lifecycle.MutableLiveData<java.lang.String> p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.MutableLiveData<com.sample.practical.view.login.LoginActivityState.ErrorMessage> getValidationLiveData() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.MutableLiveData<com.sample.practical.view.login.ClickEvent> getClickEvent() {
        return null;
    }
    
    public LoginActivityState() {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0011\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B7\u0012\b\b\u0003\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0003\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0003\u0010\u0005\u001a\u00020\u0003\u0012\b\b\u0003\u0010\u0006\u001a\u00020\u0003\u0012\b\b\u0003\u0010\u0007\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\bJ\t\u0010\u000e\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\u000f\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\u0010\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\u0011\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\u0012\u001a\u00020\u0003H\u00c6\u0003J;\u0010\u0013\u001a\u00020\u00002\b\b\u0003\u0010\u0002\u001a\u00020\u00032\b\b\u0003\u0010\u0004\u001a\u00020\u00032\b\b\u0003\u0010\u0005\u001a\u00020\u00032\b\b\u0003\u0010\u0006\u001a\u00020\u00032\b\b\u0003\u0010\u0007\u001a\u00020\u0003H\u00c6\u0001J\u0013\u0010\u0014\u001a\u00020\u00152\b\u0010\u0016\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010\u0017\u001a\u00020\u0003H\u00d6\u0001J\t\u0010\u0018\u001a\u00020\u0019H\u00d6\u0001R\u0011\u0010\u0004\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0005\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\nR\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\f\u0010\nR\u0011\u0010\u0006\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\r\u0010\nR\u0011\u0010\u0007\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\n\u00a8\u0006\u001a"}, d2 = {"Lcom/sample/practical/view/login/LoginActivityState$ErrorMessage;", "", "invalidEmail", "", "emptyEmail", "emptyPassword", "invalidUser", "isValid", "(IIIII)V", "getEmptyEmail", "()I", "getEmptyPassword", "getInvalidEmail", "getInvalidUser", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "", "other", "hashCode", "toString", "", "app_debug"})
    public static final class ErrorMessage {
        private final int invalidEmail = 0;
        private final int emptyEmail = 0;
        private final int emptyPassword = 0;
        private final int invalidUser = 0;
        private final int isValid = 0;
        
        public final int getInvalidEmail() {
            return 0;
        }
        
        public final int getEmptyEmail() {
            return 0;
        }
        
        public final int getEmptyPassword() {
            return 0;
        }
        
        public final int getInvalidUser() {
            return 0;
        }
        
        public final int isValid() {
            return 0;
        }
        
        public ErrorMessage(@androidx.annotation.StringRes()
        int invalidEmail, @androidx.annotation.StringRes()
        int emptyEmail, @androidx.annotation.StringRes()
        int emptyPassword, @androidx.annotation.StringRes()
        int invalidUser, @androidx.annotation.StringRes()
        int isValid) {
            super();
        }
        
        public ErrorMessage() {
            super();
        }
        
        public final int component1() {
            return 0;
        }
        
        public final int component2() {
            return 0;
        }
        
        public final int component3() {
            return 0;
        }
        
        public final int component4() {
            return 0;
        }
        
        public final int component5() {
            return 0;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final com.sample.practical.view.login.LoginActivityState.ErrorMessage copy(@androidx.annotation.StringRes()
        int invalidEmail, @androidx.annotation.StringRes()
        int emptyEmail, @androidx.annotation.StringRes()
        int emptyPassword, @androidx.annotation.StringRes()
        int invalidUser, @androidx.annotation.StringRes()
        int isValid) {
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