package com.mastercoding.myapplication

import android.util.Log
import javax.inject.Inject

class Display @Inject constructor() {

    init {
        Log.i("Tagy","Screen created")
    }
    fun turnOnScreen(){
        Log.i("Tagy","Turning On the Screen")
    }
}