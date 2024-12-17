package com.example.counterlivedata.counter.model

import android.content.Context
import android.content.SharedPreferences

class CounterModel(private val context: Context) {
    private val keyCounter = "_counter"
    private val _sharedPreferences: SharedPreferences =
        context.getSharedPreferences("_counter_preferences", Context.MODE_PRIVATE)

    fun getCurrentValue(): Int {
        val currentValue = _sharedPreferences.getInt(keyCounter, 0)
        return currentValue
    }

    fun changeValue(newValue: Int): Int{
        val currentValue =getCurrentValue()
        val newCounterValue = currentValue + newValue

        _sharedPreferences.edit().putInt(keyCounter, newCounterValue).apply()

        return newCounterValue
    }
}