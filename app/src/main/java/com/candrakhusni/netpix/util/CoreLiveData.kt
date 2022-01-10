package com.candrakhusni.netpix.util

import androidx.lifecycle.MutableLiveData


@Suppress("UNCHECKED_CAST")
class CoreLiveData<T>(value: T) : MutableLiveData<T>(value) {
    override fun getValue(): T = super.getValue() as T

    fun notifyChanged() {
        postValue(value)
    }
}