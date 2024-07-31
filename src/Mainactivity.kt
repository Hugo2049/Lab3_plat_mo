/*
    Hugo Ernesto Barillas Vilalgrán
    23306
    Sección 10
    Laboratorio 3
    -----------------------------------------------------------------------
 */



//-----------MAIN----------------------------------------------
fun main() {
    // Puedes crear clases derivadas de Food y probarlas aquí.
    val pasta = object : Food("Pasta", 10) {
        override fun cook(): String {
            return "Cocina la pasta en agua hirviendo durante 8-10 minutos."
        }
    }

    val steak = object : Food("Steak", 20) {
        override fun cook(): String {
            return "Cocina el bistec en una sartén caliente durante 4-6 minutos por cada lado."
        }
    }

    println("${pasta.name} cuesta ${pasta.price} y se cocina así: ${pasta.cook()}")
    println("${steak.name} cuesta ${steak.price} y se cocina así: ${steak.cook()}")

    val burger = Burguer("Hamburguesa", 15)
    val pizza = Pizza("Pizza", 12)
    val iceCream = IceCream("Helado", 8)
    val juice = Juice("Jugo de Naranja", 5)

    val foods = listOf(burger, pizza, iceCream, juice)

    for (food in foods) {
        println("${food.name} cuesta ${food.price} y se cocina así: ${food.cook()}")
    }

    println("El helado dice: ${iceCream.eat()}")

    val burgerDiscount = burger.discountedPrice(10.0)
    println("El precio con descuento de la hamburguesa es: $burgerDiscount")

}

