package com.example.myapplication.Belajar_DesignPattern_11_Composite

class CompositeCategory(name: String, private var category:List<Category>) :Category(name) {

    fun getCategories():List<Category> = category

}