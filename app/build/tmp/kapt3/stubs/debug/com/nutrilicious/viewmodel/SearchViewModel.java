package com.nutrilicious.viewmodel;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J>\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042.\u0010\u0006\u001a*\u0012&\u0012$\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00040\t0\bj\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u0004`\n0\u0007H\u0002J\u001f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\f0\u00042\u0006\u0010\r\u001a\u00020\u000eH\u0086@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u000f\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006\u0010"}, d2 = {"Lcom/nutrilicious/viewmodel/SearchViewModel;", "Landroid/arch/lifecycle/ViewModel;", "()V", "doRequest", "", "Lcom/nutrilicious/data/network/dto/FoodDto;", "req", "Lretrofit2/Call;", "Lcom/nutrilicious/data/network/dto/ListWrapper;", "Lcom/nutrilicious/data/network/dto/ItemWrapper;", "Lcom/nutrilicious/data/network/dto/SearchWrapper;", "getFoodsFor", "Lcom/nutrilicious/model/Food;", "searchTerm", "", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "app_debug"})
public final class SearchViewModel extends android.arch.lifecycle.ViewModel {
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object getFoodsFor(@org.jetbrains.annotations.NotNull()
    java.lang.String searchTerm, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super java.util.List<com.nutrilicious.model.Food>> p1) {
        return null;
    }
    
    private final java.util.List<com.nutrilicious.data.network.dto.FoodDto> doRequest(retrofit2.Call<com.nutrilicious.data.network.dto.ListWrapper<com.nutrilicious.data.network.dto.ItemWrapper<java.util.List<com.nutrilicious.data.network.dto.FoodDto>>>> req) {
        return null;
    }
    
    public SearchViewModel() {
        super();
    }
}