package com.mastercoding.myapplication

import android.util.Log
import javax.inject.Inject


class Battery @Inject constructor(){
    init {
        Log.i("TAGY", "Battery Created")
    }

    fun displayBatteryPower(){
        Log.i("TAGY", "Battery is 100%")
    }
}