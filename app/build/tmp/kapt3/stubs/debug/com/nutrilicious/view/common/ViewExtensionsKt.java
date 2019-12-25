package com.nutrilicious.view.common;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 2, d1 = {"\u00004\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\u001a$\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\b\b\u0001\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b\u001a\'\u0010\t\u001a\u0002H\n\"\b\b\u0000\u0010\n*\u00020\u000b*\u00020\u00062\f\u0010\f\u001a\b\u0012\u0004\u0012\u0002H\n0\r\u00a2\u0006\u0002\u0010\u000e\u001a\'\u0010\t\u001a\u0002H\n\"\b\b\u0000\u0010\n*\u00020\u000b*\u00020\u000f2\f\u0010\f\u001a\b\u0012\u0004\u0012\u0002H\n0\r\u00a2\u0006\u0002\u0010\u0010\u001a\u001a\u0010\u0011\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0012\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006\u001a\u0012\u0010\u0013\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0014\u001a\u00020\b\u00a8\u0006\u0015"}, d2 = {"addFragmentToState", "", "Landroid/support/v7/app/AppCompatActivity;", "containerViewId", "", "fragment", "Landroid/support/v4/app/Fragment;", "tag", "", "getViewModel", "T", "Landroid/arch/lifecycle/ViewModel;", "modelClass", "Lkotlin/reflect/KClass;", "(Landroid/support/v4/app/Fragment;Lkotlin/reflect/KClass;)Landroid/arch/lifecycle/ViewModel;", "Landroid/support/v4/app/FragmentActivity;", "(Landroid/support/v4/app/FragmentActivity;Lkotlin/reflect/KClass;)Landroid/arch/lifecycle/ViewModel;", "replaceFragment", "viewGroupId", "toast", "msg", "app_debug"})
public final class ViewExtensionsKt {
    
    @org.jetbrains.annotations.NotNull()
    public static final <T extends android.arch.lifecycle.ViewModel>T getViewModel(@org.jetbrains.annotations.NotNull()
    android.support.v4.app.FragmentActivity $this$getViewModel, @org.jetbrains.annotations.NotNull()
    kotlin.reflect.KClass<T> modelClass) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public static final <T extends android.arch.lifecycle.ViewModel>T getViewModel(@org.jetbrains.annotations.NotNull()
    android.support.v4.app.Fragment $this$getViewModel, @org.jetbrains.annotations.NotNull()
    kotlin.reflect.KClass<T> modelClass) {
        return null;
    }
    
    public static final void replaceFragment(@org.jetbrains.annotations.NotNull()
    android.support.v7.app.AppCompatActivity $this$replaceFragment, int viewGroupId, @org.jetbrains.annotations.NotNull()
    android.support.v4.app.Fragment fragment) {
    }
    
    public static final void addFragmentToState(@org.jetbrains.annotations.NotNull()
    android.support.v7.app.AppCompatActivity $this$addFragmentToState, @android.support.annotation.IdRes()
    int containerViewId, @org.jetbrains.annotations.NotNull()
    android.support.v4.app.Fragment fragment, @org.jetbrains.annotations.NotNull()
    java.lang.String tag) {
    }
    
    public static final void toast(@org.jetbrains.annotations.NotNull()
    android.support.v7.app.AppCompatActivity $this$toast, @org.jetbrains.annotations.NotNull()
    java.lang.String msg) {
    }
}