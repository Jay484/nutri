package com.nutrilicious.data.network;

import java.lang.System;

/**
 * @author Peter Sommerhoff
 */
@kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0000\bf\u0018\u00002\u00020\u0001J8\u0010\u0002\u001a\u001e\u0012\u001a\u0012\u0018\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u00050\u0004j\b\u0012\u0004\u0012\u00020\u0006`\u00070\u00032\b\b\u0001\u0010\b\u001a\u00020\t2\b\b\u0003\u0010\n\u001a\u00020\u000bH\'JX\u0010\f\u001a*\u0012&\u0012$\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00100\u000f0\u000e0\rj\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00100\u000f`\u00110\u00032\b\b\u0001\u0010\u0012\u001a\u00020\t2\b\b\u0003\u0010\u0013\u001a\u00020\u000b2\b\b\u0003\u0010\u0014\u001a\u00020\t2\b\b\u0003\u0010\u0015\u001a\u00020\u0016H\'\u00a8\u0006\u0017"}, d2 = {"Lcom/nutrilicious/data/network/UsdaApi;", "", "getDetails", "Lretrofit2/Call;", "Lcom/nutrilicious/data/network/dto/FoodsWrapper;", "Lcom/nutrilicious/data/network/dto/FoodWrapper;", "Lcom/nutrilicious/data/network/dto/DetailsDto;", "Lcom/nutrilicious/data/network/dto/DetailsWrapper;", "id", "", "detailsType", "", "getFoods", "Lcom/nutrilicious/data/network/dto/ListWrapper;", "Lcom/nutrilicious/data/network/dto/ItemWrapper;", "", "Lcom/nutrilicious/data/network/dto/FoodDto;", "Lcom/nutrilicious/data/network/dto/SearchWrapper;", "searchTerm", "sortBy", "dataSource", "offset", "", "app_debug"})
public abstract interface UsdaApi {
    
    @org.jetbrains.annotations.NotNull()
    @retrofit2.http.GET(value = "search?format=json")
    public abstract retrofit2.Call<com.nutrilicious.data.network.dto.ListWrapper<com.nutrilicious.data.network.dto.ItemWrapper<java.util.List<com.nutrilicious.data.network.dto.FoodDto>>>> getFoods(@org.jetbrains.annotations.NotNull()
    @retrofit2.http.Query(value = "q")
    java.lang.String searchTerm, @retrofit2.http.Query(value = "sort")
    char sortBy, @org.jetbrains.annotations.NotNull()
    @retrofit2.http.Query(value = "ds")
    java.lang.String dataSource, @retrofit2.http.Query(value = "offset")
    int offset);
    
    @org.jetbrains.annotations.NotNull()
    @retrofit2.http.GET(value = "V2/reports?format=json")
    public abstract retrofit2.Call<com.nutrilicious.data.network.dto.FoodsWrapper<com.nutrilicious.data.network.dto.FoodWrapper<com.nutrilicious.data.network.dto.DetailsDto>>> getDetails(@org.jetbrains.annotations.NotNull()
    @retrofit2.http.Query(value = "ndbno")
    java.lang.String id, @retrofit2.http.Query(value = "type")
    char detailsType);
    
    /**
     * @author Peter Sommerhoff
     */
    @kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 3)
    public final class DefaultImpls {
    }
}