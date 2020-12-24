package com.example.myapplication.Belajar_DesignPattern_10_Bridge.item

import com.example.myapplication.Belajar_DesignPattern_10_Bridge.bridge.BinatangDarat

class Kucing:BinatangDarat() {
    override fun getJumlahKaki(): Int = 4

    override fun getJumlahTelinga(): Int = 2

    override fun getNama(): String = "Kucing Garfield"
}