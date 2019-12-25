package com.nutrilicious.data.db;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\u0016\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0006\u0010\r\u001a\u00020\u000eH\u0007J\u0016\u0010\u000f\u001a\u00020\u000e2\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005H\u0007RJ\u0010\u0003\u001a>\u0012\u0018\u0012\u0016\u0012\u0004\u0012\u00020\u0006 \u0007*\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u00050\u0005 \u0007*\u001e\u0012\u0018\u0012\u0016\u0012\u0004\u0012\u00020\u0006 \u0007*\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u00050\u0005\u0018\u00010\u00040\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0016\u0010\b\u001a\n \u0007*\u0004\u0018\u00010\t0\tX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0016\u0010\n\u001a\n \u0007*\u0004\u0018\u00010\u000b0\u000bX\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0011"}, d2 = {"Lcom/nutrilicious/data/db/NutrientListConverter;", "", "()V", "adapter", "Lcom/squareup/moshi/JsonAdapter;", "", "Lcom/nutrilicious/model/Nutrient;", "kotlin.jvm.PlatformType", "moshi", "Lcom/squareup/moshi/Moshi;", "nutrientList", "Ljava/lang/reflect/ParameterizedType;", "toListOfNutrient", "json", "", "toString", "nutrient", "app_debug"})
public final class NutrientListConverter {
    private final com.squareup.moshi.Moshi moshi = null;
    private final java.lang.reflect.ParameterizedType nutrientList = null;
    private final com.squareup.moshi.JsonAdapter<java.util.List<com.nutrilicious.model.Nutrient>> adapter = null;
    
    @org.jetbrains.annotations.NotNull()
    @android.arch.persistence.room.TypeConverter()
    public final java.lang.String toString(@org.jetbrains.annotations.NotNull()
    java.util.List<com.nutrilicious.model.Nutrient> nutrient) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @android.arch.persistence.room.TypeConverter()
    public final java.util.List<com.nutrilicious.model.Nutrient> toListOfNutrient(@org.jetbrains.annotations.NotNull()
    java.lang.String json) {
        return null;
    }
    
    public NutrientListConverter() {
        super();
    }
}