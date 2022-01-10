package com.candrakhusni.netpix.util

import android.content.Context
import androidx.datastore.preferences.core.booleanPreferencesKey
import androidx.datastore.preferences.core.edit
import androidx.datastore.preferences.preferencesDataStore
import kotlinx.coroutines.flow.map

class DataStoreUtil(private val context: Context) {

    suspend fun isIntro(isUserInto: Boolean) {
        context.dataStore.edit { preferences ->
            preferences[IS_INTRO] = isUserInto
        }
    }

    val isIntro = context.dataStore.data.map { preferences ->
        preferences[IS_INTRO]
    }

    companion object {
        private const val DATASTORE_NAME = "netpix_pref"
        private val IS_INTRO = booleanPreferencesKey("intoo")
        private val Context.dataStore by preferencesDataStore(DATASTORE_NAME)
    }

}