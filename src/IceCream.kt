class IceCream(name: String, price: Int) : Food(name, price), Dessert {
    override fun cook(): String {
        return "Enfría el helado en el congelador durante 2-3 horas."
    }

    override fun eat(): String {
        return "Disfruta del helado frío."
    }
}
