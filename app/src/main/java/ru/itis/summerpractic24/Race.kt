package ru.itis.summerpractic24

import kotlin.random.Random

class Race(private val cars: List<Car>) {


    fun startRaces() {
        var currentCars = cars.toMutableList()
        var round = 1

        while (currentCars.size > 1) {
            println("Круг $round:")

            val winners = mutableListOf<Car>()

            while (currentCars.size >= 2) {
                val car1 = currentCars.removeAt(Random.nextInt(currentCars.size))
                val car2 = currentCars.removeAt(Random.nextInt(currentCars.size))
                val winner = race(car1, car2)
                winners.add(winner)
                println("Гонка между ${car1.brand} ${car1.model} и ${car2.brand} ${car2.model}, Победитель: ${winner.brand} ${winner.model}")
            }

            if (currentCars.size == 1) {
                println("${currentCars[0].brand} ${currentCars[0].model} - Нет пары, следующий круг")
                winners.add(currentCars.removeAt(0))
            }

            currentCars = winners.toMutableList()
            round++
        }

        println("Победитель: ${currentCars[0].brand} ${currentCars[0].model}")
    }

    private fun race(car1: Car, car2: Car): Car {
        return if (car1.horsePower > car2.horsePower) car1 else car2
    }
}