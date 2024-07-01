package ru.itis.summerpractic24

class Sedan(
    brand: String,
    model: String,
    year: Int,
    horsePower: Int,
    val numOfDoors: Int
) : Car(brand, model, year, horsePower) {
    override fun printInfo() {
        println("Седан: $brand $model ($year год). Лошадиных сил: $horsePower, $numOfDoors дверей")
    }
}