package com.candrakhusni.netpix.ui.navigation

import android.app.Activity
import android.content.Intent
import android.view.LayoutInflater
import androidx.navigation.Navigation
import com.candrakhusni.netpix.R
import com.candrakhusni.netpix.base.BaseActivity
import com.candrakhusni.netpix.databinding.ActivityBottomNavigationBinding
import com.candrakhusni.netpix.util.observe
import com.candrakhusni.netpix.util.toast
import com.google.android.material.bottomnavigation.BottomNavigationView
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch
import org.koin.androidx.viewmodel.ext.android.viewModel
import kotlin.system.exitProcess

class BottomNavigationActivity :
    BaseActivity<ActivityBottomNavigationBinding, BottomNavigationViewModel>() {

    private val navController by lazy { Navigation.findNavController(this, R.id.navHost) }
    override val viewModel: BottomNavigationViewModel by viewModel()
    private var doubleBackToExitPressedOnce = false
    private var isActiveNavigation = 0

    override fun getBinding(layoutInflater: LayoutInflater): ActivityBottomNavigationBinding {
        return ActivityBottomNavigationBinding.inflate(layoutInflater)
    }

    override fun setupViews() {
        setupIntent()
        with(binding) {
            bottomNavigation.setOnNavigationItemSelectedListener(onNavigationItemSelectedListener)
        }
    }

    private fun setupIntent() {
        if (intent.hasExtra(EXTRA_MENU)) {
            viewModel.selectedMenu.postValue(intent.getIntExtra(EXTRA_MENU, MENU_EXPLORE))
        }
    }

    private val onNavigationItemSelectedListener =
        BottomNavigationView.OnNavigationItemSelectedListener { item ->
            when (item.itemId) {
                R.id.menuExplorer -> {
                    if (navController.currentDestination?.id != R.id.menuExplorer && isActiveNavigation != 1) {
                        navController.navigate(R.id.fragmentExplore)
                        isActiveNavigation = 1
                    }
                    return@OnNavigationItemSelectedListener true
                }
                R.id.menuFavorite -> {
                    if (isActiveNavigation != 2) {
                        navController.navigate(R.id.fragmentFavorite)
                        isActiveNavigation = 2
                    }
                    return@OnNavigationItemSelectedListener true
                }
            }
            false
        }

    override fun onBackPressed() {
        when (navController.currentDestination?.id) {
            R.id.fragmentExplore -> {
                CoroutineScope(Dispatchers.Main).launch {
                    if (doubleBackToExitPressedOnce) {
                        moveTaskToBack(true)
                        android.os.Process.killProcess(android.os.Process.myPid())
                        exitProcess(1)
                    }
                    doubleBackToExitPressedOnce = true
                    toast(R.string.exit_message)

                    delay(ON_BACK_PRESS_DELAY)
                    doubleBackToExitPressedOnce = false
                }
            }
            R.id.fragmentFavorite -> {
                binding.bottomNavigation.selectedItemId = R.id.menuExplorer
            }
            else -> {
                navController.popBackStack()
            }
        }
    }

    override fun setupListeners() = Unit

    override fun setupObservers() {
        observe(viewModel.selectedMenu) {
            binding.bottomNavigation.selectedItemId = it
        }
    }

    companion object {
        const val ON_BACK_PRESS_DELAY = 2000L
        private const val EXTRA_MENU = "EXTRA_MENU"
        const val MENU_EXPLORE = R.id.menuExplorer
        const val MENU_FAVORITE = R.id.menuFavorite
        fun startPage(activity: Activity, page: Int) {
            Intent(activity, BottomNavigationActivity::class.java).let {
                it.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP)
                it.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK)
                it.putExtra(EXTRA_MENU, page)
                activity.startActivity(it)
                activity.finish()
            }
        }
    }

}