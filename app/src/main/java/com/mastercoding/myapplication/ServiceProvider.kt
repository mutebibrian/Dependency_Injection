package com.mastercoding.myapplication

import android.util.Log
import javax.inject.Inject

class ServiceProvider{


    init {
        Log.i("TAGY", "Service Provider Created")
    }
    fun getServiceProvider(){
        Log.i("TAGY", "Service Provider Connected Successfully")
    }

}