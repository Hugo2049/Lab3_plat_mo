class Burguer(name: String, price: Int) : Food(name, price) {
    override fun cook(): String {
        return "Asa la hamburguesa en una parrilla caliente durante 5-7 minutos por cada lado."
    }
}
