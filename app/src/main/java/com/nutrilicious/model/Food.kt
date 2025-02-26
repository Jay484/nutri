package com.nutrilicious.model

import android.arch.persistence.room.*
import com.nutrilicious.data.network.dto.FoodDto

@Entity(tableName = "favorites")
data class Food(
    @PrimaryKey val id: String,
    val name: String,
    val type: String,
    var isFavorite: Boolean = false
) {
  constructor(dto: FoodDto) : this(dto.ndbno, dto.name, dto.group)
}