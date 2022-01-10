package com.candrakhusni.netpix.ui.favorite

import androidx.lifecycle.ViewModel
import com.candrakhusni.netpix.data.ResultsItem
import com.candrakhusni.netpix.util.CoreLiveData

class FavoriteViewModel() : ViewModel() {
    val list = CoreLiveData<MutableList<ResultsItem>>(mutableListOf())
}