package com.example.myapplication.Belajar_DesignPattern_08_Abstract_Factory

class Game(gameFactory:GameFactory) {

    private var level:Level = gameFactory.createLevel()
    private var arena:Arena = gameFactory.createArena()

    fun start(){
        this.level.start()
        this.arena.start()
    }

}