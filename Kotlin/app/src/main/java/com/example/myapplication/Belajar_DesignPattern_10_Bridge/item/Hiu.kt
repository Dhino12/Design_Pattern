package com.example.myapplication.Belajar_DesignPattern_10_Bridge.item

import com.example.myapplication.Belajar_DesignPattern_10_Bridge.bridge.BinatangAir

class Hiu : BinatangAir() {
    override fun getNama(): String = "Hiu"
}