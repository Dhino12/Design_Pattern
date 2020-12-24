package com.example.myapplication.Belajar_DesignPattern_01_Singleton.helper

object DatabasePool {
    // singleton dengan object

    private val pool = ArrayList<Connections>()
    init {
        for (i in 0..100){
            val connection = Connections("localhost","root","root")
            pool.add(connection)
        }
    }
    fun getConnection(): Connections {
        if(pool.isEmpty()){
            throw RuntimeException("Koneksinya habis")
        }else{
            return pool.removeAt(0)
        }
    }
    fun close(connection : Connections) { pool.add(connection) }

}