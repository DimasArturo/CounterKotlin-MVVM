package com.example.counterlivedata.counter.viewmodel

import android.content.Context
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.example.counterlivedata.counter.model.CounterModel

class CounterViewModel(context: Context) :ViewModel() {
    private val _counterModel = CounterModel(context)
    private val _counter = MutableLiveData(_counterModel.getCurrentValue())


    val counter : LiveData<Int> = _counter

    fun increment(){
        _counter.value = _counterModel.changeValue(1)
    }

    fun decrement(){
        _counter.value = _counterModel.changeValue(-1)
    }
}