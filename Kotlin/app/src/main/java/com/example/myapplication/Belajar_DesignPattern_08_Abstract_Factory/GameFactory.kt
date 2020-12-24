package com.example.myapplication.Belajar_DesignPattern_08_Abstract_Factory

interface GameFactory{
    fun createLevel():Level
    fun createArena():Arena
}

class GameFactoryEasy:GameFactory {
    override fun createLevel(): Level {
        return LevelEasy()
    }

    override fun createArena(): Arena {
        return ArenaEasy()
    }
}

class GameFactoryMedium:GameFactory {
    override fun createLevel(): Level {
        return LevelMedium()
    }

    override fun createArena(): Arena {
        return ArenaMedium()
    }
}

class GameFactoryHard:GameFactory {
    override fun createLevel(): Level {
        return LevelHard()
    }

    override fun createArena(): Arena {
        return ArenaHard()
    }
}