package Belajar_DesignPattern_03_Factory_Method

interface Handphone {
    var processor:String
    var battery:String
    var screenSize:String
}
/*
* Sama seperti Builder Pattern, pattern ini juga digunakan untuk menyederhanakan proses dalam
membuat sebuah object yang rumit. Bedanya yaitu Anda bisa langsung membuat Object tanpa
harusmendefinisikan satu per satu spesifikasi yang diinginkan. Sebagai gantinya Anda akan membuat
interface dan membuat kelas turunan untuk implementasi spesifikasi yang
* */