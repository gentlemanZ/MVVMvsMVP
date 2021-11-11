package com.example.mvvmvsmvp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button
import kotlin.math.log

class MainActivity : AppCompatActivity() {

    private lateinit var buttonMVVM: Button
    private lateinit var buttonMVP: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

       buttonMVVM = this.findViewById(R.id.bt_mvvm)
        buttonMVP = this.findViewById(R.id.bt_mvp)

        buttonMVVM.setOnClickListener {
            //navigate to MVVM version of the activity
            Log.i("tianyang","opening the MVVM button")
        }

        buttonMVP.setOnClickListener {
            //navigate to MVP version of the activity
            Log.i("tianyang","opening the MVP button")
        }
    }
}