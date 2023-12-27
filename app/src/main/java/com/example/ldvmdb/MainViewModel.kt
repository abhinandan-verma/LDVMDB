package com.example.ldvmdb

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class MainViewModel : ViewModel() {

    private val counter = MutableLiveData<Int>()
    // LiveData is non-changeable -> Read Only the Counter
    val countData : LiveData<Int> get() = counter
    init {
        counter.value = 0
    }
    fun counterUpdate(){
        counter.value = (counter.value)?.plus(1)
    }
}