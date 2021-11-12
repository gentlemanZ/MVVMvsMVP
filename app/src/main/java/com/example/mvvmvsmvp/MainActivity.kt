package com.example.mvvmvsmvp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button
import com.example.mvvmvsmvp.mvp.MvpActivity
import com.example.mvvmvsmvp.mvvm.MvvmActivity
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
            val intent = Intent (this, MvvmActivity::class.java)
            startActivity(intent)
        }

        buttonMVP.setOnClickListener {
            //navigate to MVP version of the activity
            Log.i("tianyang","opening the MVP button")
            val intent = Intent (this, MvpActivity::class.java)
            startActivity(intent)
        }
    }
}