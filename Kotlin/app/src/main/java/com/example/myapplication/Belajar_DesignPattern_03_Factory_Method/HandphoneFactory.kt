package Belajar_DesignPattern_03_Factory_Method

class HandphoneFactory {
    companion object{
        fun createHandphone(type: Type):Handphone{
            return when(type){
                Type.SAMSUNG -> HandphoneSamsung()
                Type.XIAOMI -> HandphoneXiaomi()
            }
        }
    }
}