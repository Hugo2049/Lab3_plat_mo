class Pizza(name: String, price: Int) : Food(name, price) {
    override fun cook(): String {
        return "Hornea la pizza en un horno precalentado a 220°C durante 15-20 minutos."
    }
}
