package com.example.myapplication.Belajar_DesignPattern_01_Singleton.services

import com.example.myapplication.Belajar_DesignPattern_01_Singleton.helper.DatabasePool

class OrderSerivce {

    fun save(orderId:String){
        val connection = DatabasePool.getConnection()
        connection.sql("INSER INTO ORDER.....")
        DatabasePool.close(connection)
    }
}