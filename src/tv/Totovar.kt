package tv

class Totovar(nname:Double, pprice:Double, vvid:String) {

    companion object {
        fun buy(toTovar: Tovar) {

            println("Введите сколько денег у вас на балансе")
            var balance = readLine()!!.toDouble()

            println("Выберите товар:\n1. Футболка: 3200руб\n2. Брюки: 1890руб\n3. Стул: 6700руб\n4. ПК: 77990руб\n5. Карбюратор: 45800руб")
            val choice = readLine()!!.toInt()

            var selectedProduct = when(choice) {
                1 -> {
                    if (balance >= 3200) {
                        balance -= 3200
                        "Футболка: 3200руб"
                    } else {
                        "Недостаточно средств на счете для покупки футболки"
                    }
                }
                2 -> {
                    if (balance >= 1890) {
                        balance -= 1890
                        "Брюки: 1890руб"
                    } else {
                        "Недостаточно средств на счете для покупки брюк"
                    }
                }
                3 -> {
                    if (balance >= 6700) {
                        balance -= 6700
                        "Стул: 6700руб"
                    } else {
                        "Недостаточно средств на счете для покупки стула"
                    }
                }
                4 -> {
                    if (balance >= 77990) {
                        balance -= 77990
                        "ПК: 77990руб"
                    } else {
                        "Недостаточно средств на счете для покупки ПК"
                    }
                }
                5 -> {
                    if (balance >= 45800) {
                        balance -= 45800
                        "Карбюратор: 45800руб"
                    } else {
                        "Недостаточно средств на счете для покупки карбюратора"
                    }
                }
                else -> "Товар отсутствует в списке"
            }

            println("Вы выбрали $selectedProduct")
            println("Остаток на счете: $balance")


        }
    }



}