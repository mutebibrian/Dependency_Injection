package com.mastercoding.myapplication

import dagger.Component


//Here am telling to use this interface in order to get instances from mobile class function
//component makes dagger create a graph of dependencies
@Component
interface mobilecomponent {

    fun getMobileInstance():Mobile



}