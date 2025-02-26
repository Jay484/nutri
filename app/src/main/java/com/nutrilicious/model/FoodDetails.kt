package com.nutrilicious.model

import android.arch.persistence.room.*
import com.nutrilicious.data.db.NutrientListConverter
import com.nutrilicious.data.network.dto.*

@Entity(tableName = "details")
@TypeConverters(NutrientListConverter::class)
data class FoodDetails(
    @PrimaryKey val id: String,
    val name: String,
    val nutrients: List<Nutrient>
) {
  constructor(dto: DetailsDto) : this(
      dto.desc.ndbno,
      dto.desc.name,
      dto.nutrients.map(::Nutrient)
  )
}

data class Nutrient(
    val id: Int,
    val detailsId: String,
    val name: String,
    val amountPer100g: Float,
    val unit: String,
    val type: NutrientType
) {
  constructor(dto: NutrientDto) : this(
      dto.nutrient_id!!,
      dto.detailsId!!,
      dto.name,
      dto.value,
      dto.unit,
      NutrientType.valueOf(dto.group.toUpperCase())
  )
}

enum class NutrientType {
  PROXIMATES, MINERALS, VITAMINS, LIPIDS, OTHER
}
