package com.candrakhusni.netpix.ui

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.lifecycle.lifecycleScope
import com.candrakhusni.netpix.databinding.ActivityIntroBinding
import com.candrakhusni.netpix.ui.navigation.BottomNavigationActivity
import com.candrakhusni.netpix.util.DataStoreUtil
import com.candrakhusni.netpix.util.onThrottledClick
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch
import org.koin.android.ext.android.inject

class IntroActivity : AppCompatActivity() {
    private lateinit var binding: ActivityIntroBinding
    val dataStore: DataStoreUtil by inject()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityIntroBinding.inflate(layoutInflater)
        setContentView(binding.root)

        setupView()
    }

    private fun setupView() {
        binding.btnNext.onThrottledClick {
            lifecycleScope.launch(Dispatchers.Main) {
                dataStore.isIntro(true)
                startActivity(Intent(this@IntroActivity, BottomNavigationActivity::class.java))
                finish()
            }
        }
    }

}