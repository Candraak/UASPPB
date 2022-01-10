package com.candrakhusni.netpix.ui.detail

import androidx.lifecycle.ViewModel
import com.candrakhusni.netpix.data.ResultsItem
import com.candrakhusni.netpix.util.CoreLiveData

class DetailViewModel() : ViewModel() {

    val movieData = CoreLiveData<ResultsItem?>(null)
}