package Belajar_DesignPattern_04_Depedency_Injection

fun main() {
    val engine = Engine()
    val car = Car(engine)
    car.start()
}