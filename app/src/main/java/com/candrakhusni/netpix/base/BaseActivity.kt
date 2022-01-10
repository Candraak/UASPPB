package com.candrakhusni.netpix.base

import android.os.Bundle
import android.view.LayoutInflater
import androidx.appcompat.app.AppCompatActivity
import androidx.lifecycle.ViewModel
import androidx.viewbinding.ViewBinding
import com.candrakhusni.netpix.util.DataStoreUtil
import org.koin.android.ext.android.inject

abstract class BaseActivity<VB : ViewBinding, VM : ViewModel> : AppCompatActivity() {

    lateinit var binding: VB

    protected abstract val viewModel: VM

    val dataStore: DataStoreUtil by inject()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = getBinding(layoutInflater)
        setContentView(binding.root)
        setupViews()
        setupListeners()
        setupObservers()
    }

    abstract fun getBinding(layoutInflater: LayoutInflater): VB

    abstract fun setupViews()

    abstract fun setupListeners()

    abstract fun setupObservers()

}