package com.nutrilicious.data.network.dto;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u00002\u00020\u0001B\u001b\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005\u00a2\u0006\u0002\u0010\u0007R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0017\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b\u00a8\u0006\f"}, d2 = {"Lcom/nutrilicious/data/network/dto/DetailsDto;", "", "desc", "Lcom/nutrilicious/data/network/dto/DescriptionDto;", "nutrients", "", "Lcom/nutrilicious/data/network/dto/NutrientDto;", "(Lcom/nutrilicious/data/network/dto/DescriptionDto;Ljava/util/List;)V", "getDesc", "()Lcom/nutrilicious/data/network/dto/DescriptionDto;", "getNutrients", "()Ljava/util/List;", "app_debug"})
@com.squareup.moshi.JsonClass(generateAdapter = true)
public final class DetailsDto {
    @org.jetbrains.annotations.NotNull()
    private final com.nutrilicious.data.network.dto.DescriptionDto desc = null;
    @org.jetbrains.annotations.NotNull()
    private final java.util.List<com.nutrilicious.data.network.dto.NutrientDto> nutrients = null;
    
    @org.jetbrains.annotations.NotNull()
    public final com.nutrilicious.data.network.dto.DescriptionDto getDesc() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.List<com.nutrilicious.data.network.dto.NutrientDto> getNutrients() {
        return null;
    }
    
    public DetailsDto(@org.jetbrains.annotations.NotNull()
    com.nutrilicious.data.network.dto.DescriptionDto desc, @org.jetbrains.annotations.NotNull()
    java.util.List<com.nutrilicious.data.network.dto.NutrientDto> nutrients) {
        super();
    }
}