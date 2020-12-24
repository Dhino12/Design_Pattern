package com.example.myapplication.Belajar_DesignPattern_08_Abstract_Factory

interface Arena{
    fun start()
}

class ArenaEasy :Arena{
    override fun start() {
        println("Arena Easy")
    }
}

class ArenaMedium :Arena{
    override fun start() {
        println("Arena Medium")
    }
}

class ArenaHard :Arena{
    override fun start() {
        println("Arena Hard")
    }
}