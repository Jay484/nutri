package com.nutrilicious.data

import android.content.Context
import com.nutrilicious.data.db.AppDatabase
import com.nutrilicious.data.db.DB
import com.nutrilicious.data.db.dbScope
import com.nutrilicious.data.network.NETWORK
import com.nutrilicious.data.network.dto.DetailsDto
import com.nutrilicious.data.network.dto.DetailsWrapper
import com.nutrilicious.data.network.usdaApi
import com.nutrilicious.model.FoodDetails
import kotlinx.coroutines.launch
import kotlinx.coroutines.withContext
import retrofit2.Call

class DetailsRepository(ctx: Context) {

  private val detailsDao by lazy { AppDatabase.getInstance(ctx).detailsDao() }

  fun add(details: FoodDetails) = dbScope.launch { detailsDao.insert(details) }

  suspend fun getDetails(id: String): FoodDetails? {
    return withContext(DB) { detailsDao.loadById(id) }       // Prefers database
        ?: withContext(NETWORK) { fetchDetailsFromApi(id) }  // Falls back to network
            .also { if (it != null) this.add(it) } // Adds newly fetched foods to DB
  }

  private suspend fun fetchDetailsFromApi(id: String): FoodDetails? {
    val request: Call<DetailsWrapper<DetailsDto>> = usdaApi.getDetails(id)

    val detailsDto: DetailsDto = withContext(NETWORK) {
      request.execute().body()?.foods?.get(0)?.food
    } ?: return null

    return FoodDetails(detailsDto)
  }
}
