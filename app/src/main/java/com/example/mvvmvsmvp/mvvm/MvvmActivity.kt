package com.example.mvvmvsmvp.mvvm

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.databinding.DataBindingUtil
import com.example.mvvmvsmvp.R
import com.example.mvvmvsmvp.databinding.ActivityMvvmBinding

class MvvmActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_mvvm)
        val binding: ActivityMvvmBinding = DataBindingUtil.setContentView(this, R.layout.activity_mvvm)
        binding.lifecycleOwner = this
        binding.viewmodel = MvvmViewModel(this)
    }
}