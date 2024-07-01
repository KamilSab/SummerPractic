package ru.itis.summerpractic24

import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import kotlin.random.Random


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
        val inputField: EditText = findViewById(R.id.inputField)
        val startButton: Button = findViewById(R.id.startButton)

        startButton.setOnClickListener {
            val carCount = inputField.text.toString().toIntOrNull() ?: 0

            if (carCount > 0) {
                val cars = generateRandomCars(carCount)
                val race = Race(cars)
                race.startRaces()
            }
        }
    }
}

private fun generateRandomCars(count: Int): List<Car> {
    val carList = mutableListOf<Car>()
    val random = Random(System.currentTimeMillis())

    repeat(count) {
        val carType = random.nextInt(4)  // Выбираем случайный тип автомобиля
        val carBuilder = when (carType) {
            0 -> CarBuilder("Sedan").setModel("Модель ${random.nextInt(100)}").setYear(random.nextInt(1990, 2024)).setHorsePower(random.nextInt(100, 500)).setNumOfDoors(listOf(2, 4).random())
            1 -> CarBuilder("SUV").setModel("Модель ${random.nextInt(100)}").setYear(random.nextInt(1990, 2024)).setHorsePower(random.nextInt(100, 500))
                .setDriveType(listOf("передний", "задний", "полный").random())
            2 -> CarBuilder("JDMCar").setModel("Модель ${random.nextInt(100)}").setYear(random.nextInt(1990, 2024)).setHorsePower(random.nextInt(100, 500))
                .setMotor(listOf("такой", "сякой", "ещетакой").random())
            3 -> CarBuilder("SportCar").setModel("Модель ${random.nextInt(100)}").setYear(random.nextInt(1990, 2024)).setHorsePower(random.nextInt(100, 500))
                .setMaxSpeed(random.nextInt(100, 300))
            else -> CarBuilder("Car").setModel("Модель ${random.nextInt(100)}").setYear(random.nextInt(1990, 2024))
        }

        carList.add(carBuilder.build())
    }

    return carList
}