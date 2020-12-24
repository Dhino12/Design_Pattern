package com.example.myapplication.Belajar_DesignPattern_08_Abstract_Factory


fun main() {

    val gameEasy = Game(GameFactoryEasy())
    gameEasy.start()
}