class Juice(name: String, price: Int) : Drink(name, price) {
    override fun cook(): String {
        return "Exprime las frutas para hacer jugo fresco."
    }

    override fun pour(): String {
        return "Vierte el jugo en un vaso."
    }
}
