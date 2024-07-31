abstract class Drink(name: String, price: Int) : Food(name, price) {
    abstract fun pour(): String
}
