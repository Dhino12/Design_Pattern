package com.example.myapplication.Belajar_DesignPattern_07_Template_Method


abstract class BlockTemplate {

    fun start(){
        println(getTitle())

        for (i in 0..getHeight()){
            for (j in 0..getWidth()){
                print(getCharacter())
            }
            print("\n\r")
        }

        println(getEndTitle())
    }

    protected abstract fun getTitle():String

    protected abstract fun getEndTitle():String

    protected abstract fun getCharacter():String

    protected abstract fun getHeight():Int

    protected abstract fun getWidth():Int
}