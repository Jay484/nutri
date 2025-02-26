package com.nutrilicious.data.db

import android.arch.persistence.room.Database
import android.arch.persistence.room.Room
import android.arch.persistence.room.RoomDatabase
import android.content.Context
import com.nutrilicious.BuildConfig
import com.nutrilicious.model.Food
import com.nutrilicious.model.FoodDetails
import kotlinx.coroutines.CoroutineScope


val dbScope = CoroutineScope(DB)

@Database(entities = [Food::class, FoodDetails::class], version = 2)
abstract class AppDatabase : RoomDatabase() {

  companion object {
    private var INSTANCE: AppDatabase? = null

    fun getInstance(ctx: Context): AppDatabase {
      if (INSTANCE == null) { INSTANCE = buildDatabase(ctx) }
      return INSTANCE!!
    }

    private fun buildDatabase(ctx: Context) = Room
        .databaseBuilder(ctx, AppDatabase::class.java, "AppDatabase")
        .apply { if (BuildConfig.DEBUG) fallbackToDestructiveMigration() }
        .build()
  }

  abstract fun favoritesDao(): FavoritesDao
  abstract fun detailsDao(): DetailsDao
}
