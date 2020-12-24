package com.example.myapplication.Belajar_DesignPattern_09_Prototype

fun main() {
    val store1 = Store("Toko W","Jakarta","Indonesia","Gadget")
    store1.cetakToko()

    val store2 = store1.copy()
    store2.name = "Toko X"
    store2.cetakToko()

    val store3 = store1.copy()
    store3.name = "Toko Y"
    store3.city = "Jogja"
    store3.cetakToko()

    val store4 = store3.copy()
    store4.name = "Toko Z"
    store4.category = "Fashion"
    store4.cetakToko()
}