package tv

open class Train (var number:Double, var punkt:String, var time:Double) {

    var punktn = ""
    var data = 0.0

    fun input(train1: Train) {

        try {
            println("Введите number")
            train1.number = readLine()!!.toDouble()
            println("Введите пункт оправления")
            train1.punkt = readLine()!!.toString()
            println("Введите дату отправления")
            train1.data = readLine()!!.toDouble()
            println("Введите Пункт назначения")
            train1.punktn = readLine()!!.toString()
            println("Введите время в пути")
            train1.time = readLine()!!.toDouble()

        } catch (e: Exception) {
            println("Ошибка")
        }
    }

    fun vesTrain(train1: Train) {
        try {

            println("введите длину поезда")
            var a = readLine()!!.toDouble()

            println("Ввелите ширину поезда")
            var b = readLine()!!.toDouble()

            var s = b * a
            println("Площадь поезда $s")

        } catch (e: Exception) {
            println("Ошибка")
        }
    }

    fun peopl(train1: Train) {
        println("Введите вес посетителя")
        var people = readLine()!!.toInt()
        when {
            (people <= 40) -> println("Ребенок")
            (people > 40 && people < 80) -> {
                println("Взрослый человек от 17 до 30 лет")
            }
        }
    }

    fun gruzpod(train1: Train) {
        println("Как называется состав поезда")
        println("Введите вес одного вагона")
        var a = readln()!!.toDouble()
        println("Введите кол-во вагонов")
        var kolvag = readLine()!!.toInt()

        var gruz = a * kolvag
        println("Вес всего состава$gruz")
    }
}
    

