package com.candrakhusni.netpix.di

import com.candrakhusni.netpix.ui.detail.DetailViewModel
import com.candrakhusni.netpix.ui.explore.ExploreViewModel
import com.candrakhusni.netpix.ui.favorite.FavoriteViewModel
import com.candrakhusni.netpix.ui.navigation.BottomNavigationViewModel
import com.candrakhusni.netpix.util.DataStoreUtil
import org.koin.androidx.viewmodel.dsl.viewModel
import org.koin.dsl.module

val viewModelModule = module {
    viewModel { BottomNavigationViewModel() }
    viewModel { ExploreViewModel() }
    viewModel { FavoriteViewModel() }
    viewModel { DetailViewModel() }
}

val utilModule = module {
    single { DataStoreUtil(get()) }
}