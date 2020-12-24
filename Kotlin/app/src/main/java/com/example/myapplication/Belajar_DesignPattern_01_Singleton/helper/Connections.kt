package com.example.myapplication.Belajar_DesignPattern_01_Singleton.helper

import java.util.*

class Connections(host:String, userName:String, password:String) {

    fun sql(sql:String){}

    fun sql(sql:String, vararg params:Objects) {}


}