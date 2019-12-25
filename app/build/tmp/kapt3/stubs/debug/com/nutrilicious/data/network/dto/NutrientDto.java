package com.nutrilicious.data.network.dto;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u000b\n\u0002\u0010\b\n\u0002\b\t\n\u0002\u0010\u0007\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002R\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\u001a\u0010\t\u001a\u00020\u0004X\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u0006\"\u0004\b\u000b\u0010\bR\u001a\u0010\f\u001a\u00020\u0004X\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u0006\"\u0004\b\u000e\u0010\bR\u001e\u0010\u000f\u001a\u0004\u0018\u00010\u0010X\u0086\u000e\u00a2\u0006\u0010\n\u0002\u0010\u0015\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014R\u001a\u0010\u0016\u001a\u00020\u0004X\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0017\u0010\u0006\"\u0004\b\u0018\u0010\bR\u001a\u0010\u0019\u001a\u00020\u001aX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001b\u0010\u001c\"\u0004\b\u001d\u0010\u001e\u00a8\u0006\u001f"}, d2 = {"Lcom/nutrilicious/data/network/dto/NutrientDto;", "", "()V", "detailsId", "", "getDetailsId", "()Ljava/lang/String;", "setDetailsId", "(Ljava/lang/String;)V", "group", "getGroup", "setGroup", "name", "getName", "setName", "nutrient_id", "", "getNutrient_id", "()Ljava/lang/Integer;", "setNutrient_id", "(Ljava/lang/Integer;)V", "Ljava/lang/Integer;", "unit", "getUnit", "setUnit", "value", "", "getValue", "()F", "setValue", "(F)V", "app_debug"})
@com.squareup.moshi.JsonClass(generateAdapter = true)
public final class NutrientDto {
    @org.jetbrains.annotations.Nullable()
    private java.lang.Integer nutrient_id;
    @org.jetbrains.annotations.Nullable()
    private java.lang.String detailsId;
    @org.jetbrains.annotations.NotNull()
    public java.lang.String name;
    @org.jetbrains.annotations.NotNull()
    public java.lang.String unit;
    private float value;
    @org.jetbrains.annotations.NotNull()
    public java.lang.String group;
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Integer getNutrient_id() {
        return null;
    }
    
    public final void setNutrient_id(@org.jetbrains.annotations.Nullable()
    java.lang.Integer p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getDetailsId() {
        return null;
    }
    
    public final void setDetailsId(@org.jetbrains.annotations.Nullable()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getName() {
        return null;
    }
    
    public final void setName(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getUnit() {
        return null;
    }
    
    public final void setUnit(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
    }
    
    public final float getValue() {
        return 0.0F;
    }
    
    public final void setValue(float p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getGroup() {
        return null;
    }
    
    public final void setGroup(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
    }
    
    public NutrientDto() {
        super();
    }
}