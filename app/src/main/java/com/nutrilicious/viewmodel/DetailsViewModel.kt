package com.nutrilicious.viewmodel

import android.app.Application
import android.arch.lifecycle.AndroidViewModel
import com.nutrilicious.data.DetailsRepository
import com.nutrilicious.model.FoodDetails


class DetailsViewModel(app: Application) : AndroidViewModel(app) {
  private val repo = DetailsRepository(app)
  suspend fun getDetails(foodId: String): FoodDetails? = repo.getDetails(foodId)
}