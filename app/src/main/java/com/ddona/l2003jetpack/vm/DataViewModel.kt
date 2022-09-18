package com.ddona.l2003jetpack.vm

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class DataViewModel: ViewModel() {
    //cơ chế observer
    var number = MutableLiveData<Int>(0) //observer pattern //2

    fun updateNumber() {
        number.value = number.value!!.plus(1)//2
    }
}