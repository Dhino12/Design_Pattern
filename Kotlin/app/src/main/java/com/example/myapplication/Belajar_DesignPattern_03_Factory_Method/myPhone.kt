package Belajar_DesignPattern_03_Factory_Method

fun main(){

    val myPhone = HandphoneFactory.createHandphone(Type.SAMSUNG)
    print(myPhone.processor + "\n")
    myPhone.processor = "Kirin"
    println(myPhone.processor)

}