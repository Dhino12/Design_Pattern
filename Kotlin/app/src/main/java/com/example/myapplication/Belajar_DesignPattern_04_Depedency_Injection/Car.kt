package Belajar_DesignPattern_04_Depedency_Injection

class Car (private val engine:Engine){
    fun start(){
        engine.start()
    }
}

/*
* Dengan seperti ini maka kita bisa membuat Class Car yang berbeda dengan hanya mengganti Engine
yang dimasukkan. Selain itu, proses testing pun menjadi lebih mudah.
Namun sekarang Anda harus memasukkan parameter Engine di setiap kali akan membuat Car. Saat
ini sudah banyak terdapat tools/library yang memudahkan kita untuk mengimplementasikan
dependency injection seperti Dagger, Koin dan yang terbaru Hilt.
* */