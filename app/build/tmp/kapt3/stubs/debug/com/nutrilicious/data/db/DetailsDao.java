package com.nutrilicious.data.db;

import java.lang.System;

@android.arch.persistence.room.Dao()
@kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\bg\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\'J\u0012\u0010\u0006\u001a\u0004\u0018\u00010\u00052\u0006\u0010\u0007\u001a\u00020\bH\'\u00a8\u0006\t"}, d2 = {"Lcom/nutrilicious/data/db/DetailsDao;", "", "insert", "", "food", "Lcom/nutrilicious/model/FoodDetails;", "loadById", "ndbno", "", "app_debug"})
public abstract interface DetailsDao {
    
    @org.jetbrains.annotations.Nullable()
    @android.arch.persistence.room.Query(value = "SELECT * FROM details WHERE id = :ndbno")
    public abstract com.nutrilicious.model.FoodDetails loadById(@org.jetbrains.annotations.NotNull()
    java.lang.String ndbno);
    
    @android.arch.persistence.room.Insert(onConflict = android.arch.persistence.room.OnConflictStrategy.REPLACE)
    public abstract void insert(@org.jetbrains.annotations.NotNull()
    com.nutrilicious.model.FoodDetails food);
}