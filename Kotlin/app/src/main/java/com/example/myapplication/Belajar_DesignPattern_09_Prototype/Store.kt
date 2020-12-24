package com.example.myapplication.Belajar_DesignPattern_09_Prototype

data class Store(
    var name:String,
    var city:String,
    var country:String,
    var category:String
){
    fun cetakToko(){
        println("""
            Toko        = $name, ===========
            Kota        = $city,
            Negara      = $country,
            Categori    = $category
        """.trimIndent())
    }
}