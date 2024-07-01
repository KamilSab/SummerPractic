package ru.itis.summerpractic24

open class Car(
    val brand: String,
    val model: String,
    val year: Int,
    val horsePower: Int
) {
    open fun printInfo() {
        println("Автомобиль: $brand $model ($year год). Лошадиных сил: $horsePower")
    }
}