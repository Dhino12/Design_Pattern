package Belajar_DesignPattern_01_Singleton

import com.example.myapplication.Belajar_DesignPattern_01_Singleton.services.OrderDetailService
import com.example.myapplication.Belajar_DesignPattern_01_Singleton.services.OrderSerivce

fun main(){
    val orderService = OrderSerivce()
    orderService.save("001")

    val orderDetailService = OrderDetailService()
    orderDetailService.save("001","indoMie")
    orderDetailService.save("002","Bon Cabe")
    orderDetailService.save("003","Aqua")
}