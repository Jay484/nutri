package com.nutrilicious.data;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u000e\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000eJ\u001b\u0010\u000f\u001a\u0004\u0018\u00010\u000e2\u0006\u0010\u0010\u001a\u00020\u0011H\u0082@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0012J\u001b\u0010\u0013\u001a\u0004\u0018\u00010\u000e2\u0006\u0010\u0010\u001a\u00020\u0011H\u0086@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0012R\u001b\u0010\u0005\u001a\u00020\u00068BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u0007\u0010\b\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006\u0014"}, d2 = {"Lcom/nutrilicious/data/DetailsRepository;", "", "ctx", "Landroid/content/Context;", "(Landroid/content/Context;)V", "detailsDao", "Lcom/nutrilicious/data/db/DetailsDao;", "getDetailsDao", "()Lcom/nutrilicious/data/db/DetailsDao;", "detailsDao$delegate", "Lkotlin/Lazy;", "add", "Lkotlinx/coroutines/Job;", "details", "Lcom/nutrilicious/model/FoodDetails;", "fetchDetailsFromApi", "id", "", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getDetails", "app_debug"})
public final class DetailsRepository {
    private final kotlin.Lazy detailsDao$delegate = null;
    
    private final com.nutrilicious.data.db.DetailsDao getDetailsDao() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final kotlinx.coroutines.Job add(@org.jetbrains.annotations.NotNull()
    com.nutrilicious.model.FoodDetails details) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object getDetails(@org.jetbrains.annotations.NotNull()
    java.lang.String id, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super com.nutrilicious.model.FoodDetails> p1) {
        return null;
    }
    
    public DetailsRepository(@org.jetbrains.annotations.NotNull()
    android.content.Context ctx) {
        super();
    }
}