package KotlinOOP

/*
    # Kotlin Class Functions:

    You can also use functions inside a class, to performer certain actions:
 */

class Car(var brand: String, var model: String, var year: Int) {
    fun drive() {
        println("Vrumm Vrumm Vrumm!")
    }

    fun speed(maxSpeed: Int) {
        println("Max speed is: $maxSpeed miles/s")
    }
}

fun main() {
    val c1 = Car("Ford", "Mustang", 1979)

    println(c1.drive())
    println(c1.speed(300))
}