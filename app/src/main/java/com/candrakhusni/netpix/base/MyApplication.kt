package com.candrakhusni.netpix.base

import android.app.Application
import com.candrakhusni.netpix.di.utilModule
import com.candrakhusni.netpix.di.viewModelModule
import org.koin.android.ext.koin.androidContext
import org.koin.android.ext.koin.androidLogger
import org.koin.core.context.startKoin
import org.koin.core.logger.Level
import timber.log.Timber

class MyApplication : Application() {
    override fun onCreate() {
        super.onCreate()
        initKoin()
        Timber.plant()
    }

    private fun initKoin() {
        startKoin {
            androidLogger(Level.NONE)
            androidContext(this@MyApplication)
            modules(
                listOf(
                    viewModelModule,
                    utilModule
                )
            )
        }
    }

}