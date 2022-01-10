package com.candrakhusni.netpix.ui.explore

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import androidx.paging.Pager
import androidx.paging.PagingConfig
import androidx.paging.cachedIn
import androidx.paging.liveData
import com.candrakhusni.netpix.ui.explore.paging.ExploreDataSource

class ExploreViewModel() : ViewModel() {
    fun movieList() = getList().cachedIn(viewModelScope)

    private fun getList() = Pager(
        config = PagingConfig(
            pageSize = 20,
            maxSize = 30,
            prefetchDistance = 2,
            enablePlaceholders = false),
        pagingSourceFactory = { ExploreDataSource() }).liveData
}