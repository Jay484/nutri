package com.nutrilicious.data.db;

import android.arch.persistence.db.SupportSQLiteStatement;
import android.arch.persistence.room.EntityInsertionAdapter;
import android.arch.persistence.room.RoomDatabase;
import android.arch.persistence.room.RoomSQLiteQuery;
import android.database.Cursor;
import com.nutrilicious.model.FoodDetails;
import com.nutrilicious.model.Nutrient;
import java.lang.Override;
import java.lang.String;
import java.lang.SuppressWarnings;
import java.util.List;

@SuppressWarnings("unchecked")
public class DetailsDao_Impl implements DetailsDao {
  private final RoomDatabase __db;

  private final EntityInsertionAdapter __insertionAdapterOfFoodDetails;

  private final NutrientListConverter __nutrientListConverter = new NutrientListConverter();

  public DetailsDao_Impl(RoomDatabase __db) {
    this.__db = __db;
    this.__insertionAdapterOfFoodDetails = new EntityInsertionAdapter<FoodDetails>(__db) {
      @Override
      public String createQuery() {
        return "INSERT OR REPLACE INTO `details`(`id`,`name`,`nutrients`) VALUES (?,?,?)";
      }

      @Override
      public void bind(SupportSQLiteStatement stmt, FoodDetails value) {
        if (value.getId() == null) {
          stmt.bindNull(1);
        } else {
          stmt.bindString(1, value.getId());
        }
        if (value.getName() == null) {
          stmt.bindNull(2);
        } else {
          stmt.bindString(2, value.getName());
        }
        final String _tmp;
        _tmp = __nutrientListConverter.toString(value.getNutrients());
        if (_tmp == null) {
          stmt.bindNull(3);
        } else {
          stmt.bindString(3, _tmp);
        }
      }
    };
  }

  @Override
  public void insert(FoodDetails food) {
    __db.beginTransaction();
    try {
      __insertionAdapterOfFoodDetails.insert(food);
      __db.setTransactionSuccessful();
    } finally {
      __db.endTransaction();
    }
  }

  @Override
  public FoodDetails loadById(String ndbno) {
    final String _sql = "SELECT * FROM details WHERE id = ?";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 1);
    int _argIndex = 1;
    if (ndbno == null) {
      _statement.bindNull(_argIndex);
    } else {
      _statement.bindString(_argIndex, ndbno);
    }
    final Cursor _cursor = __db.query(_statement);
    try {
      final int _cursorIndexOfId = _cursor.getColumnIndexOrThrow("id");
      final int _cursorIndexOfName = _cursor.getColumnIndexOrThrow("name");
      final int _cursorIndexOfNutrients = _cursor.getColumnIndexOrThrow("nutrients");
      final FoodDetails _result;
      if(_cursor.moveToFirst()) {
        final String _tmpId;
        _tmpId = _cursor.getString(_cursorIndexOfId);
        final String _tmpName;
        _tmpName = _cursor.getString(_cursorIndexOfName);
        final List<Nutrient> _tmpNutrients;
        final String _tmp;
        _tmp = _cursor.getString(_cursorIndexOfNutrients);
        _tmpNutrients = __nutrientListConverter.toListOfNutrient(_tmp);
        _result = new FoodDetails(_tmpId,_tmpName,_tmpNutrients);
      } else {
        _result = null;
      }
      return _result;
    } finally {
      _cursor.close();
      _statement.release();
    }
  }
}
