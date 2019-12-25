package com.nutrilicious.view.main;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\f\u0012\b\u0012\u00060\u0002R\u00020\u00000\u0001:\u0001\u0017BA\u0012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\u0012\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\b0\u0007\u0012\u0018\u0010\t\u001a\u0014\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\b0\n\u00a2\u0006\u0002\u0010\fJ\b\u0010\r\u001a\u00020\u000bH\u0016J\u001c\u0010\u000e\u001a\u00020\b2\n\u0010\u000f\u001a\u00060\u0002R\u00020\u00002\u0006\u0010\u0010\u001a\u00020\u000bH\u0016J\u001c\u0010\u0011\u001a\u00060\u0002R\u00020\u00002\u0006\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u000bH\u0016J\u0014\u0010\u0015\u001a\u00020\b2\f\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004R\u0014\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u001a\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\b0\u0007X\u0082\u0004\u00a2\u0006\u0002\n\u0000R \u0010\t\u001a\u0014\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\b0\nX\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0018"}, d2 = {"Lcom/nutrilicious/view/main/SearchListAdapter;", "Landroid/support/v7/widget/RecyclerView$Adapter;", "Lcom/nutrilicious/view/main/SearchListAdapter$ViewHolder;", "items", "", "Lcom/nutrilicious/model/Food;", "onItemClick", "Lkotlin/Function1;", "", "onStarClick", "Lkotlin/Function2;", "", "(Ljava/util/List;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function2;)V", "getItemCount", "onBindViewHolder", "holder", "position", "onCreateViewHolder", "parent", "Landroid/view/ViewGroup;", "viewType", "setItems", "newItems", "ViewHolder", "app_debug"})
public final class SearchListAdapter extends android.support.v7.widget.RecyclerView.Adapter<com.nutrilicious.view.main.SearchListAdapter.ViewHolder> {
    private java.util.List<com.nutrilicious.model.Food> items;
    private final kotlin.jvm.functions.Function1<com.nutrilicious.model.Food, kotlin.Unit> onItemClick = null;
    private final kotlin.jvm.functions.Function2<com.nutrilicious.model.Food, java.lang.Integer, kotlin.Unit> onStarClick = null;
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public com.nutrilicious.view.main.SearchListAdapter.ViewHolder onCreateViewHolder(@org.jetbrains.annotations.NotNull()
    android.view.ViewGroup parent, int viewType) {
        return null;
    }
    
    @java.lang.Override()
    public int getItemCount() {
        return 0;
    }
    
    @java.lang.Override()
    public void onBindViewHolder(@org.jetbrains.annotations.NotNull()
    com.nutrilicious.view.main.SearchListAdapter.ViewHolder holder, int position) {
    }
    
    public final void setItems(@org.jetbrains.annotations.NotNull()
    java.util.List<com.nutrilicious.model.Food> newItems) {
    }
    
    public SearchListAdapter(@org.jetbrains.annotations.NotNull()
    java.util.List<com.nutrilicious.model.Food> items, @org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function1<? super com.nutrilicious.model.Food, kotlin.Unit> onItemClick, @org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function2<? super com.nutrilicious.model.Food, ? super java.lang.Integer, kotlin.Unit> onStarClick) {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0004\u0018\u00002\u00020\u00012\u00020\u0002B\r\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u00a2\u0006\u0002\u0010\u0005J\u000e\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000bR\u0014\u0010\u0003\u001a\u00020\u0004X\u0096\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007\u00a8\u0006\f"}, d2 = {"Lcom/nutrilicious/view/main/SearchListAdapter$ViewHolder;", "Landroid/support/v7/widget/RecyclerView$ViewHolder;", "Lkotlinx/android/extensions/LayoutContainer;", "containerView", "Landroid/view/View;", "(Lcom/nutrilicious/view/main/SearchListAdapter;Landroid/view/View;)V", "getContainerView", "()Landroid/view/View;", "bindTo", "", "food", "Lcom/nutrilicious/model/Food;", "app_debug"})
    public final class ViewHolder extends android.support.v7.widget.RecyclerView.ViewHolder implements kotlinx.android.extensions.LayoutContainer {
        @org.jetbrains.annotations.NotNull()
        private final android.view.View containerView = null;
        private java.util.HashMap _$_findViewCache;
        
        public final void bindTo(@org.jetbrains.annotations.NotNull()
        com.nutrilicious.model.Food food) {
        }
        
        @org.jetbrains.annotations.NotNull()
        @java.lang.Override()
        public android.view.View getContainerView() {
            return null;
        }
        
        public ViewHolder(@org.jetbrains.annotations.NotNull()
        android.view.View containerView) {
            super(null);
        }
    }
}