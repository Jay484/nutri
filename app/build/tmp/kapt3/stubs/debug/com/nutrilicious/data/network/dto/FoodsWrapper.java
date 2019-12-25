package com.nutrilicious.data.network.dto;

import java.lang.System;

/**
 * @author Peter Sommerhoff
 */
@kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u0005\b\u0007\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002B\u0005\u00a2\u0006\u0002\u0010\u0003R \u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u0005X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\t\u00a8\u0006\n"}, d2 = {"Lcom/nutrilicious/data/network/dto/FoodsWrapper;", "T", "", "()V", "foods", "", "getFoods", "()Ljava/util/List;", "setFoods", "(Ljava/util/List;)V", "app_debug"})
@com.squareup.moshi.JsonClass(generateAdapter = true)
public final class FoodsWrapper<T extends java.lang.Object> {
    @org.jetbrains.annotations.NotNull()
    private java.util.List<? extends T> foods;
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.List<T> getFoods() {
        return null;
    }
    
    public final void setFoods(@org.jetbrains.annotations.NotNull()
    java.util.List<? extends T> p0) {
    }
    
    public FoodsWrapper() {
        super();
    }
}