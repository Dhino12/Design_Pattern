package com.example.myapplication.Belajar_DesignPattern_01_Singleton.services

import com.example.myapplication.Belajar_DesignPattern_01_Singleton.helper.DatabasePool

class OrderDetailService {
    fun save(overId:String, product:String){
        val connection = DatabasePool.getConnection()
        connection.sql("INSERT INTO ORDER_DETAILS ....")
        DatabasePool.close(connection)
    }
}