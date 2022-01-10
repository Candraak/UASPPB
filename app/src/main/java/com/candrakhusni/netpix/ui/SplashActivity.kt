package com.candrakhusni.netpix.ui

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.lifecycle.lifecycleScope
import com.candrakhusni.netpix.R
import com.candrakhusni.netpix.ui.navigation.BottomNavigationActivity
import com.candrakhusni.netpix.util.DataStoreUtil
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.delay
import kotlinx.coroutines.flow.collect
import kotlinx.coroutines.launch
import org.koin.android.ext.android.inject

class SplashActivity : AppCompatActivity() {

    val dataStore: DataStoreUtil by inject()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        setupView()
    }

    private fun setupView() {
        lifecycleScope.launch(Dispatchers.Main) {
            delay(2000)
            dataStore.isIntro.collect { isIntro ->
                if (isIntro == true) {
                    startActivity(Intent(this@SplashActivity, BottomNavigationActivity::class.java))
                    finish()
                } else {
                    startActivity(Intent(this@SplashActivity, IntroActivity::class.java))
                    finish()
                }
            }
        }
    }

}