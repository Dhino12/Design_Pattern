package com.example.myapplication.Belajar_DesignPattern_01_Singleton.helper

class DatabaseHelper {

    // Singleton dengan companion object
    companion object{
        private var connection: Connections? = null
        fun getInstanceConnection(): Connections? {
            if(connection == null){
                connection = Connections("localhost","root","root")
            }
            return connection
        }
    }

    /*
    * Pattern ini digunakan ketika Anda ingin memastikan suatu object hanya memiliki satu instance saja
    dan satu cara akses ke instance tersebut. Cara ini akan sangat bermanfaat ketika sebuah object
    dibutuhkan di banyak Class. Terlebih terhadap object-object yang memang akan digunakan terus
    menerus seperti object HttpClient atau Database.
    * */
}