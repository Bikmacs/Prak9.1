package tv

class Otparvka(var mimo: String, var speed:Double, otpnumber:Double, ppunkt:String, timen:Double):
    Train(otpnumber, ppunkt, timen) {

    fun speed(otpravka1: Otparvka){

        println("Введите пройденное расстояние")
        var a = readLine()!!.toInt()
        var b = otpravka1.time
        var speed = a / b
        println("Скорость вашего поезда равна:$speed")

        println("Щас ммы найдем время поезди")
        var rass = a / speed
        println("Время поездки:$rass")
    }

}