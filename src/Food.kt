abstract class Food(val name: String, val price: Int) {
    abstract fun cook(): String
}

fun Food.discountedPrice(discount: Double): Double {
    return price * (1 - discount / 100)
}