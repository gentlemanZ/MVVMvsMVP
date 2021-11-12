package com.example.mvvmvsmvp.mvvm

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class MvvmViewModel : ViewModel() {

    val inputText: MutableLiveData<String> by lazy {
        MutableLiveData<String> ()
    }

    val outputText: MutableLiveData<String> by lazy {
        MutableLiveData<String> ()
    }
}