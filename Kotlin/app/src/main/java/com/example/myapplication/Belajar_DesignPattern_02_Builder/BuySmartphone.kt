package Belajar_DesignPattern_02_Builder

fun main(){
    val buyPhone = Handphone.Builder("Snapdragon") // wajib diisi
        .setBattery("5000mAH") // optional
        .create() // membuat builder
    println(buyPhone)

    /*
    * Pattern ini digunakan ketika kita ingin membuat sebuah object secara bertahap namun hanya fokus
    pada pada bentuk object yang diinginkan.Sehingga kita tidak perlu mendefinisikan semua variabel
    yang ada di class tersebut. Cukup yang akan diubah saja
    * */
}