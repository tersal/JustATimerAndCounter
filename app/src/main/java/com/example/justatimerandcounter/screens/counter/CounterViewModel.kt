package com.example.justatimerandcounter.screens.counter

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class CounterViewModel: ViewModel() {

    // Current counter value
    private val _score = MutableLiveData<Int>()
    val score: LiveData<Int>
        get() = _score

    init {
        _score.value = 0
    }

    fun onCountIncrease() {
        _score.value = _score.value?.plus(1)
    }

    fun onCountDecrease() {
        _score.value = _score.value?.minus(1)
    }

    fun onCountReset() {
        _score.value = 0
    }
}