package com.example.myapplication.Belajar_DesignPattern_08_Abstract_Factory

interface Level{
    fun start()
}

class LevelEasy : Level{
    override fun start() {
        println("Level Easy")
    }
}

class LevelMedium : Level{
    override fun start() {
        println("Level Medium")
    }
}

class LevelHard : Level{
    override fun start() {
        println("Level Hard")
    }
}