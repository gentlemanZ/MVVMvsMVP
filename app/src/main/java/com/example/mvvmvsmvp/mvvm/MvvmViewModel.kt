package com.example.mvvmvsmvp.mvvm

import androidx.lifecycle.*

class MvvmViewModel(lifecycleOwner: LifecycleOwner) : ViewModel() {

    val inputText: MutableLiveData<String> by lazy {
        MutableLiveData<String> ()
    }

    val outputText: MutableLiveData<String> by lazy {
        MutableLiveData<String> ()
    }

    init {
        outputText.postValue("This is the MVVM activity")
        inputText.observe( lifecycleOwner, Observer {
            outputText.postValue(it)
        })
    }
}