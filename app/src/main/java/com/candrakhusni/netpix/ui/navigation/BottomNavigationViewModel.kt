package com.candrakhusni.netpix.ui.navigation

import androidx.lifecycle.ViewModel
import com.candrakhusni.netpix.util.CoreLiveData

class BottomNavigationViewModel : ViewModel() {
    val selectedMenu = CoreLiveData(0)
}