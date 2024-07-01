package ru.itis.summerpractic24

class JDMCar(
    mark: String,
    model: String,
    year: Int,
    horsePower: Int,
    val motor : String
) : Car(mark, model, year, horsePower) {
    override fun printInfo() {
        println("JDM машина: $brand $model ($year год). Лошадиных сил: $horsePower, Мотор: $motor")
    }
}