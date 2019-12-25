package com.nutrilicious.data.db;

import java.lang.System;

@android.arch.persistence.room.Dao()
@kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0000\n\u0002\u0010\u000e\n\u0000\bg\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\'J\u0010\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\'J\u0014\u0010\u0007\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\t0\bH\'J\u000e\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u000b0\tH\'\u00a8\u0006\f"}, d2 = {"Lcom/nutrilicious/data/db/FavoritesDao;", "", "delete", "", "food", "Lcom/nutrilicious/model/Food;", "insert", "loadAll", "Landroid/arch/lifecycle/LiveData;", "", "loadAllIds", "", "app_debug"})
public abstract interface FavoritesDao {
    
    @org.jetbrains.annotations.NotNull()
    @android.arch.persistence.room.Query(value = "SELECT * FROM favorites")
    public abstract android.arch.lifecycle.LiveData<java.util.List<com.nutrilicious.model.Food>> loadAll();
    
    @org.jetbrains.annotations.NotNull()
    @android.arch.persistence.room.Query(value = "SELECT id FROM favorites")
    public abstract java.util.List<java.lang.String> loadAllIds();
    
    @android.arch.persistence.room.Insert(onConflict = android.arch.persistence.room.OnConflictStrategy.IGNORE)
    public abstract void insert(@org.jetbrains.annotations.NotNull()
    com.nutrilicious.model.Food food);
    
    @android.arch.persistence.room.Delete()
    public abstract void delete(@org.jetbrains.annotations.NotNull()
    com.nutrilicious.model.Food food);
}