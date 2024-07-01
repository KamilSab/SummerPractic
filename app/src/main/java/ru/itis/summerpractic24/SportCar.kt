package ru.itis.summerpractic24

class SportCar(
    brand: String,
    model: String,
    year: Int,
    horsePower: Int,
    val maxSpeed: Int
) : Car(brand, model, year, horsePower) {
    override fun printInfo() {
        println("Спортивная машина: $brand $model ($year год). Лошадиных сил: $horsePower, Максимальная скорость: $maxSpeed км/ч")
    }
}