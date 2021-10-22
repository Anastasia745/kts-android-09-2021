package com.example.unsplash

import android.content.Context
import androidx.datastore.core.DataStore
import androidx.datastore.preferences.core.Preferences
import androidx.datastore.preferences.core.edit
import androidx.datastore.preferences.core.stringPreferencesKey
import androidx.datastore.preferences.preferencesDataStore
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.map

class DatastoreRepository(
    context: Context
) {

    private val Context.dataStore: DataStore<Preferences> by preferencesDataStore(name = DATASTORE_NAME)

    private val dataStore: DataStore<Preferences> = context.dataStore

    suspend fun save() {
        dataStore.edit {
            it[KEY] = "yes"
        }
    }

    fun observe(): Flow<String> {
        return dataStore.data
            .map {
                it[KEY].orEmpty()
            }
    }

    companion object {
        private const val DATASTORE_NAME = "datastore"
        public val KEY = stringPreferencesKey("key")
    }

}