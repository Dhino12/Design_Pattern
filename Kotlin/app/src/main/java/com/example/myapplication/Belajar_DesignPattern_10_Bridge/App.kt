package com.example.myapplication.Belajar_DesignPattern_10_Bridge

import com.example.myapplication.Belajar_DesignPattern_10_Bridge.bridge.BinatangAir
import com.example.myapplication.Belajar_DesignPattern_10_Bridge.bridge.BinatangDarat
import com.example.myapplication.Belajar_DesignPattern_10_Bridge.item.Hiu
import com.example.myapplication.Belajar_DesignPattern_10_Bridge.item.Kucing


fun main() {

    val binatangs: List<Binatang> = listOf(Kucing(), Hiu())
    binatangs.forEach { binatang ->
        if (binatang is BinatangAir) {
            println(binatang.getNama() + " hidup di air")
        }else if(binatang is BinatangDarat){
            println(binatang.getNama() + " hidup di darat " + binatang.getJumlahKaki() + " kaki")
        }
    }

}