package kotlin_oop

/*
        # Kotlin Classes/Objects:

        Everything in Kotlin is associated with classes and objects, along with its properties and functions.
        For example: in real life, a car is an object. The car has properties, such as brand, weight and color,
        and functions, such as drive and brake.

        Example:
        Create a Car class along with some properties (brand, model and year)
*/

class PropertiesCar {
    var brand = ""
    var model = ""
    var year = 0
    var chassis = ""
    var size = ""
}

/*
    A property is basically a variable that belongs to the class.

    Good to Know: It is considered good practice to start the name of a class with an upper case letter,
    for better organization.
*/

fun main() {

    val car = PropertiesCar()

    car.brand = "Chevrolet"
    car.model = "S10"
    car.year = 2018
    car.chassis = "ytx23mj98a5"
    car.size = "G"

    println("Your car is: \n${car.brand} \n${car.model} \n${car.year} \n${car.chassis} \n${car.size}")

}

/*
    # Multiple Objects:

    You can create multiple objects of one class. You can user the 'Class' to create somethings 'Objects'
 */