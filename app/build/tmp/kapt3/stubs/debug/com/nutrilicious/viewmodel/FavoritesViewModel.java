package com.nutrilicious.viewmodel;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u000e\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000eJ\u000e\u0010\u000f\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000eJ\u0017\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00120\u0011H\u0086@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0013J\u001d\u0010\u0014\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000e0\u00110\u0015H\u0086@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0013R\u001b\u0010\u0005\u001a\u00020\u00068BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u0007\u0010\b\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006\u0016"}, d2 = {"Lcom/nutrilicious/viewmodel/FavoritesViewModel;", "Landroid/arch/lifecycle/AndroidViewModel;", "app", "Landroid/app/Application;", "(Landroid/app/Application;)V", "dao", "Lcom/nutrilicious/data/db/FavoritesDao;", "getDao", "()Lcom/nutrilicious/data/db/FavoritesDao;", "dao$delegate", "Lkotlin/Lazy;", "add", "Lkotlinx/coroutines/Job;", "favorite", "Lcom/nutrilicious/model/Food;", "delete", "getAllIds", "", "", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getFavorites", "Landroid/arch/lifecycle/LiveData;", "app_debug"})
public final class FavoritesViewModel extends android.arch.lifecycle.AndroidViewModel {
    private final kotlin.Lazy dao$delegate = null;
    
    private final com.nutrilicious.data.db.FavoritesDao getDao() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object getFavorites(@org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super android.arch.lifecycle.LiveData<java.util.List<com.nutrilicious.model.Food>>> p0) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object getAllIds(@org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super java.util.List<java.lang.String>> p0) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final kotlinx.coroutines.Job add(@org.jetbrains.annotations.NotNull()
    com.nutrilicious.model.Food favorite) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final kotlinx.coroutines.Job delete(@org.jetbrains.annotations.NotNull()
    com.nutrilicious.model.Food favorite) {
        return null;
    }
    
    public FavoritesViewModel(@org.jetbrains.annotations.NotNull()
    android.app.Application app) {
        super(null);
    }
}