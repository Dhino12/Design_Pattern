package com.example.myapplication.Belajar_DesignPattern_10_Bridge.bridge

import com.example.myapplication.Belajar_DesignPattern_10_Bridge.Binatang

abstract class BinatangAir : Binatang{

    override fun hidupDiAir(): Boolean = true

    override fun hidupDiDarat(): Boolean = false

}