package com.candrakhusni.netpix.ui.explore.paging

import androidx.paging.PagingSource
import androidx.paging.PagingState
import com.candrakhusni.netpix.data.ResultsItem
import com.candrakhusni.netpix.util.DummyUtil

class ExploreDataSource : PagingSource<Int, ResultsItem>() {

    override suspend fun load(params: LoadParams<Int>): LoadResult<Int, ResultsItem> {
        return try {
            val nextPageNumber = 1
            LoadResult.Page(
                data = DummyUtil.list().results ?: listOf(),
                prevKey = if (nextPageNumber == 1) null else nextPageNumber - 1,
                nextKey = null
            )
        } catch (e: Exception) {
            LoadResult.Error(e)
        }
    }

    override fun getRefreshKey(state: PagingState<Int, ResultsItem>): Int? {
        return state.anchorPosition?.let { anchorPosition ->
            state.closestPageToPosition(anchorPosition)?.prevKey?.plus(1)
                ?: state.closestPageToPosition(anchorPosition)?.nextKey?.minus(1)
        }
    }

}