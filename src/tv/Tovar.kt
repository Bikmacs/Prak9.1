package tv

class Tovar {

    var name =""
    var price = 0.0
    var ediz = ""
    var vid = ""
    var kol = 0

    fun input(Tovar1: Tovar) {
        println("Введите название товара")
        name = readLine()!!.toString()
        println("Введите цену товара")
        price = readLine()!!.toDouble()
        println("Введите ед.измерения")
        ediz = readLine()!!.toString()
        println("Введите вид товара")
        vid = readLine()!!.toString()
        println("Введите количество товара")
        kol = readLine()!!.toInt()
    }

    fun output(Tovar1: Tovar) {
        println("Название ${Tovar1.name}, Цена:${Tovar1.price}, Единицы измерения:${Tovar1.ediz}, Вид товара:${Tovar1.vid}, Количество товара${Tovar1.kol} ;")
    }
}