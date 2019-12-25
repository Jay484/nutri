package com.nutrilicious.view.main;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\u0012\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\fH\u0014J\u0010\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0010H\u0016J\u0010\u0010\u0011\u001a\u00020\n2\u0006\u0010\u0012\u001a\u00020\u0013H\u0014J\b\u0010\u0014\u001a\u00020\nH\u0002J\u001e\u0010\u0015\u001a\u00020\n2\u0006\u0010\u0016\u001a\u00020\u00172\u000e\b\u0002\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u001a0\u0019J\b\u0010\u001b\u001a\u00020\nH\u0002J\u001e\u0010\u001c\u001a\u00020\u001d2\u0006\u0010\u0016\u001a\u00020\u00172\f\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u001a0\u0019H\u0002J\u0010\u0010\u001f\u001a\u00020\n2\u0006\u0010 \u001a\u00020\u001aH\u0002J\u0010\u0010!\u001a\u00020\n2\u0006\u0010 \u001a\u00020\u001aH\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0082.\u00a2\u0006\u0002\n\u0000\u00a8\u0006\""}, d2 = {"Lcom/nutrilicious/view/main/MainActivity;", "Landroid/support/v7/app/AppCompatActivity;", "()V", "favoritesViewModel", "Lcom/nutrilicious/viewmodel/FavoritesViewModel;", "navListener", "Landroid/support/design/widget/BottomNavigationView$OnNavigationItemSelectedListener;", "searchFragment", "Lcom/nutrilicious/view/main/SearchFragment;", "onCreate", "", "savedInstanceState", "Landroid/os/Bundle;", "onCreateOptionsMenu", "", "menu", "Landroid/view/Menu;", "onNewIntent", "intent", "Landroid/content/Intent;", "recoverOrBuildSearchFragment", "setUpRecyclerView", "rv", "Landroid/support/v7/widget/RecyclerView;", "list", "", "Lcom/nutrilicious/model/Food;", "setUpSearchFragment", "setUpSearchListAdapter", "Lcom/nutrilicious/view/main/SearchListAdapter;", "items", "startDetailsActivity", "food", "toggleFavorite", "app_debug"})
public final class MainActivity extends android.support.v7.app.AppCompatActivity {
    private com.nutrilicious.view.main.SearchFragment searchFragment;
    private com.nutrilicious.viewmodel.FavoritesViewModel favoritesViewModel;
    private final android.support.design.widget.BottomNavigationView.OnNavigationItemSelectedListener navListener = null;
    private java.util.HashMap _$_findViewCache;
    
    public final void setUpRecyclerView(@org.jetbrains.annotations.NotNull()
    android.support.v7.widget.RecyclerView rv, @org.jetbrains.annotations.NotNull()
    java.util.List<com.nutrilicious.model.Food> list) {
    }
    
    private final com.nutrilicious.view.main.SearchListAdapter setUpSearchListAdapter(android.support.v7.widget.RecyclerView rv, java.util.List<com.nutrilicious.model.Food> items) {
        return null;
    }
    
    private final void startDetailsActivity(com.nutrilicious.model.Food food) {
    }
    
    @java.lang.Override()
    protected void onCreate(@org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
    }
    
    private final void toggleFavorite(com.nutrilicious.model.Food food) {
    }
    
    @java.lang.Override()
    public boolean onCreateOptionsMenu(@org.jetbrains.annotations.NotNull()
    android.view.Menu menu) {
        return false;
    }
    
    @java.lang.Override()
    protected void onNewIntent(@org.jetbrains.annotations.NotNull()
    android.content.Intent intent) {
    }
    
    private final void recoverOrBuildSearchFragment() {
    }
    
    private final void setUpSearchFragment() {
    }
    
    public MainActivity() {
        super();
    }
}