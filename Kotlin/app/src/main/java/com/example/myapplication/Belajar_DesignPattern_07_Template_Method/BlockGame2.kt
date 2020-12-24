package com.example.myapplication.Belajar_DesignPattern_07_Template_Method

class BlockGame2: BlockTemplate() {
    override fun getTitle(): String {
        return "BLOCK GAME 2"
    }

    override fun getEndTitle(): String {
        return "FINISH BLOCK GAME"
    }

    override fun getCharacter(): String {
        return "A"
    }

    override fun getHeight(): Int {
        return 5
    }

    override fun getWidth(): Int {
        return 5
    }
}