package com.nutrilicious.view.main

import android.arch.lifecycle.Observer
import android.content.Context
import android.os.Bundle
import android.support.v4.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.nutrilicious.R
import com.nutrilicious.view.common.UI
import com.nutrilicious.view.common.bgScope
import com.nutrilicious.view.common.getViewModel
import com.nutrilicious.viewmodel.FavoritesViewModel
import kotlinx.android.synthetic.main.fragment_favorites.*
import kotlinx.coroutines.launch


class FavoritesFragment : Fragment() {

  private lateinit var favoritesViewModel: FavoritesViewModel

  override fun onAttach(context: Context?) {
    super.onAttach(context)
    favoritesViewModel = getViewModel(FavoritesViewModel::class)
  }

  override fun onCreateView(inflater: LayoutInflater,
                            container: ViewGroup?,
                            savedInstanceState: Bundle?): View? {
    return inflater.inflate(R.layout.fragment_favorites, container, false)
  }

  override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
    super.onViewCreated(view, savedInstanceState)
    setUpRecyclerView()
    observeFavorites()
  }

  private fun setUpRecyclerView() {
    (activity as? MainActivity)?.setUpRecyclerView(rvFavorites, emptyList())
  }

  private fun observeFavorites() = bgScope.launch {
    val favorites = favoritesViewModel.getFavorites()
    favorites.observe(this@FavoritesFragment, Observer { foods ->
      foods?.let {
        launch(UI) { (rvFavorites.adapter as? SearchListAdapter)?.setItems(foods) }
      }
    })
  }
}
