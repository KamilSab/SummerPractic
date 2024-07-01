package ru.itis.summerpractic24

class CarBuilder(val brand: String) {
    private var model: String = "Неизвестно"
    private var year: Int = 0
    private var numOfDoors: Int = 0
    private var driveType: String = "Неизвестно"
    private var horsePower: Int = 0
    private var maxSpeed: Int = 0
    private var motor: String = "Неизвестно"

    fun setModel(model: String) = apply { this.model = model }
    fun setYear(year: Int) = apply { this.year = year }
    fun setNumOfDoors(numOfDoors: Int) = apply { this.numOfDoors = numOfDoors }
    fun setDriveType(driveType: String) = apply { this.driveType = driveType }
    fun setHorsePower(enginePower: Int) = apply { this.horsePower = enginePower }
    fun setMaxSpeed(maxSpeed: Int) = apply { this.maxSpeed = maxSpeed }
    fun setMotor(motor: String) = apply { this.motor = motor}

    fun build(): Car {
        return when (brand) {
            "Sedan" -> Sedan(brand, model, year, horsePower, numOfDoors)
            "SUV" -> SUV(brand, model, year, horsePower, driveType)
            "SportCar" -> SportCar(brand, model, year, horsePower, maxSpeed)
            "JDMCar" -> JDMCar(brand, model, year, horsePower, motor)
            else -> Car(brand, model, year, horsePower)
        }
    }
}