package com.mastercoding.myapplication
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle


class MainActivity : AppCompatActivity() {

private lateinit var mobile: Mobile

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        Daggermobilecomponent.create().getMobileInstance()










    //4 instances
        //val battrey = Battery()
       // val display = Display()
       // val serviceprovider = ServiceProvider()
       // val simcard = SimCard()
        //simcard.serviceProvider = ServiceProvider()

        //val mobile =Mobile(Battery(),SimCard(),Display())
        //now i will call the method turn on mobile to ensure that the mobile is created succesfully
       // mobile.turnOnMobile()









    }
}