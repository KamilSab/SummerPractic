package ru.itis.summerpractic24

class SUV(
    brand: String,
    model: String,
    year: Int,
    horsePower: Int,
    val driveType: String,
) : Car(brand, model, year, horsePower) {
    override fun printInfo() {
        println("SUV машина: $brand $model ($year год). Лошадиных сил: $horsePower, Привод: $driveType")
    }
}