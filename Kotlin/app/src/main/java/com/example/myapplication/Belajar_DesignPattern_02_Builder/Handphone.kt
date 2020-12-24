package Belajar_DesignPattern_02_Builder

class Handphone private constructor(builder:Builder){
    private var processor:String = builder.processor
    private var battery:String = builder.battery
    private var screenSize:String = builder.screenSize

    // Builder Class
    class Builder(processor:String){
        var processor:String = processor
        var battery:String = "4000mAH"
        var screenSize:String = "6inch"

        fun setBattery(battery:String):Builder{
            this.battery = battery
            return this
        }

        fun setScreenSize(screenSize:String):Builder{
            this.screenSize = screenSize
            return this
        }

        fun create():Handphone{
            return Handphone(this)
        }
    }
}