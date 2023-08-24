package com.mastercoding.myapplication
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import javax.inject.Inject

class MainActivity : AppCompatActivity() {



    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
//4 instances
        val battrey = Battery()
        val display = Display()
        val serviceprovider = ServiceProvider()
        val simcard = SimCard(serviceprovider)

        val mobile =Mobile(battrey,simcard,display)
        //now i will call the method turn on mobile to ensure that the mobile is created succesfully
        mobile.turnOnMobile()









    }
}