package com.example.myapplication.Belajar_DesignPattern_11_Composite

import java.util.*

fun main() {
    val categories = listOf(
            CompositeCategory("Handphone", listOf(
                    Category("Android"),
                    Category("iOS"),
                )),
            CompositeCategory("Computer", listOf(
                CompositeCategory("Laptop", listOf(
                    Category("Acer"),
                    Category("Asus")
                )),
                Category("PC"),
            )),
            CompositeCategory("Printer", listOf(
                Category("Cannon"),
                Category("HP"),
            )),
        )

    categories.forEach {
        category -> printCategory(category)
    }
}

fun printCategory(category: Category){
    println(category.getNama())
    if(category is CompositeCategory){
        val compositeCategory = category
        compositeCategory.getCategories().forEach {
            value -> printCategory(value)
        }
    }
}