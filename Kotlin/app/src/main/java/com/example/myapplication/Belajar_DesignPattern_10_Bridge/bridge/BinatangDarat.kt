package com.example.myapplication.Belajar_DesignPattern_10_Bridge.bridge

import com.example.myapplication.Belajar_DesignPattern_10_Bridge.Binatang

abstract class BinatangDarat : Binatang {

    override fun hidupDiAir(): Boolean = false

    override fun hidupDiDarat(): Boolean = true

    abstract fun getJumlahKaki():Int

    abstract fun getJumlahTelinga():Int
}