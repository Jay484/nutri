package com.nutrilicious.viewmodel

import android.app.Application
import android.arch.lifecycle.AndroidViewModel
import android.arch.lifecycle.LiveData
import com.nutrilicious.data.db.AppDatabase
import com.nutrilicious.data.db.DB
import com.nutrilicious.data.db.dbScope
import com.nutrilicious.model.Food
import kotlinx.coroutines.launch
import kotlinx.coroutines.withContext


class FavoritesViewModel(app: Application) : AndroidViewModel(app) {

  private val dao by lazy { AppDatabase.getInstance(getApplication()).favoritesDao()}

  suspend fun getFavorites(): LiveData<List<Food>> = withContext(DB) {
    dao.loadAll()
  }

  suspend fun getAllIds(): List<String> = withContext(DB) { dao.loadAllIds() }

  fun add(favorite: Food) = dbScope.launch { dao.insert(favorite) }

  fun delete(favorite: Food) = dbScope.launch { dao.delete(favorite) }
}
