package com.nutrilicious.data.db;

import android.arch.persistence.db.SupportSQLiteDatabase;
import android.arch.persistence.db.SupportSQLiteOpenHelper;
import android.arch.persistence.db.SupportSQLiteOpenHelper.Callback;
import android.arch.persistence.db.SupportSQLiteOpenHelper.Configuration;
import android.arch.persistence.room.DatabaseConfiguration;
import android.arch.persistence.room.InvalidationTracker;
import android.arch.persistence.room.RoomOpenHelper;
import android.arch.persistence.room.RoomOpenHelper.Delegate;
import android.arch.persistence.room.util.TableInfo;
import android.arch.persistence.room.util.TableInfo.Column;
import android.arch.persistence.room.util.TableInfo.ForeignKey;
import android.arch.persistence.room.util.TableInfo.Index;
import java.lang.IllegalStateException;
import java.lang.Override;
import java.lang.String;
import java.lang.SuppressWarnings;
import java.util.HashMap;
import java.util.HashSet;

@SuppressWarnings("unchecked")
public class AppDatabase_Impl extends AppDatabase {
  private volatile FavoritesDao _favoritesDao;

  private volatile DetailsDao _detailsDao;

  @Override
  protected SupportSQLiteOpenHelper createOpenHelper(DatabaseConfiguration configuration) {
    final SupportSQLiteOpenHelper.Callback _openCallback = new RoomOpenHelper(configuration, new RoomOpenHelper.Delegate(2) {
      @Override
      public void createAllTables(SupportSQLiteDatabase _db) {
        _db.execSQL("CREATE TABLE IF NOT EXISTS `favorites` (`id` TEXT NOT NULL, `name` TEXT NOT NULL, `type` TEXT NOT NULL, `isFavorite` INTEGER NOT NULL, PRIMARY KEY(`id`))");
        _db.execSQL("CREATE TABLE IF NOT EXISTS `details` (`id` TEXT NOT NULL, `name` TEXT NOT NULL, `nutrients` TEXT NOT NULL, PRIMARY KEY(`id`))");
        _db.execSQL("CREATE TABLE IF NOT EXISTS room_master_table (id INTEGER PRIMARY KEY,identity_hash TEXT)");
        _db.execSQL("INSERT OR REPLACE INTO room_master_table (id,identity_hash) VALUES(42, \"0f562fb6633d41728e01e39a8581fb53\")");
      }

      @Override
      public void dropAllTables(SupportSQLiteDatabase _db) {
        _db.execSQL("DROP TABLE IF EXISTS `favorites`");
        _db.execSQL("DROP TABLE IF EXISTS `details`");
      }

      @Override
      protected void onCreate(SupportSQLiteDatabase _db) {
        if (mCallbacks != null) {
          for (int _i = 0, _size = mCallbacks.size(); _i < _size; _i++) {
            mCallbacks.get(_i).onCreate(_db);
          }
        }
      }

      @Override
      public void onOpen(SupportSQLiteDatabase _db) {
        mDatabase = _db;
        internalInitInvalidationTracker(_db);
        if (mCallbacks != null) {
          for (int _i = 0, _size = mCallbacks.size(); _i < _size; _i++) {
            mCallbacks.get(_i).onOpen(_db);
          }
        }
      }

      @Override
      protected void validateMigration(SupportSQLiteDatabase _db) {
        final HashMap<String, TableInfo.Column> _columnsFavorites = new HashMap<String, TableInfo.Column>(4);
        _columnsFavorites.put("id", new TableInfo.Column("id", "TEXT", true, 1));
        _columnsFavorites.put("name", new TableInfo.Column("name", "TEXT", true, 0));
        _columnsFavorites.put("type", new TableInfo.Column("type", "TEXT", true, 0));
        _columnsFavorites.put("isFavorite", new TableInfo.Column("isFavorite", "INTEGER", true, 0));
        final HashSet<TableInfo.ForeignKey> _foreignKeysFavorites = new HashSet<TableInfo.ForeignKey>(0);
        final HashSet<TableInfo.Index> _indicesFavorites = new HashSet<TableInfo.Index>(0);
        final TableInfo _infoFavorites = new TableInfo("favorites", _columnsFavorites, _foreignKeysFavorites, _indicesFavorites);
        final TableInfo _existingFavorites = TableInfo.read(_db, "favorites");
        if (! _infoFavorites.equals(_existingFavorites)) {
          throw new IllegalStateException("Migration didn't properly handle favorites(com.nutrilicious.model.Food).\n"
                  + " Expected:\n" + _infoFavorites + "\n"
                  + " Found:\n" + _existingFavorites);
        }
        final HashMap<String, TableInfo.Column> _columnsDetails = new HashMap<String, TableInfo.Column>(3);
        _columnsDetails.put("id", new TableInfo.Column("id", "TEXT", true, 1));
        _columnsDetails.put("name", new TableInfo.Column("name", "TEXT", true, 0));
        _columnsDetails.put("nutrients", new TableInfo.Column("nutrients", "TEXT", true, 0));
        final HashSet<TableInfo.ForeignKey> _foreignKeysDetails = new HashSet<TableInfo.ForeignKey>(0);
        final HashSet<TableInfo.Index> _indicesDetails = new HashSet<TableInfo.Index>(0);
        final TableInfo _infoDetails = new TableInfo("details", _columnsDetails, _foreignKeysDetails, _indicesDetails);
        final TableInfo _existingDetails = TableInfo.read(_db, "details");
        if (! _infoDetails.equals(_existingDetails)) {
          throw new IllegalStateException("Migration didn't properly handle details(com.nutrilicious.model.FoodDetails).\n"
                  + " Expected:\n" + _infoDetails + "\n"
                  + " Found:\n" + _existingDetails);
        }
      }
    }, "0f562fb6633d41728e01e39a8581fb53", "c3202b1003d0798b68b8e59d6d9ced9b");
    final SupportSQLiteOpenHelper.Configuration _sqliteConfig = SupportSQLiteOpenHelper.Configuration.builder(configuration.context)
        .name(configuration.name)
        .callback(_openCallback)
        .build();
    final SupportSQLiteOpenHelper _helper = configuration.sqliteOpenHelperFactory.create(_sqliteConfig);
    return _helper;
  }

  @Override
  protected InvalidationTracker createInvalidationTracker() {
    return new InvalidationTracker(this, "favorites","details");
  }

  @Override
  public void clearAllTables() {
    super.assertNotMainThread();
    final SupportSQLiteDatabase _db = super.getOpenHelper().getWritableDatabase();
    try {
      super.beginTransaction();
      _db.execSQL("DELETE FROM `favorites`");
      _db.execSQL("DELETE FROM `details`");
      super.setTransactionSuccessful();
    } finally {
      super.endTransaction();
      _db.query("PRAGMA wal_checkpoint(FULL)").close();
      if (!_db.inTransaction()) {
        _db.execSQL("VACUUM");
      }
    }
  }

  @Override
  public FavoritesDao favoritesDao() {
    if (_favoritesDao != null) {
      return _favoritesDao;
    } else {
      synchronized(this) {
        if(_favoritesDao == null) {
          _favoritesDao = new FavoritesDao_Impl(this);
        }
        return _favoritesDao;
      }
    }
  }

  @Override
  public DetailsDao detailsDao() {
    if (_detailsDao != null) {
      return _detailsDao;
    } else {
      synchronized(this) {
        if(_detailsDao == null) {
          _detailsDao = new DetailsDao_Impl(this);
        }
        return _detailsDao;
      }
    }
  }
}
