package kotlin_oop

/*
    In Kotlin, there's a faster way of doing this, by using a constructor.

    A constructor is like a special function, and it is defined by using two parentheses () after the class name.
    You can specify the properties inside of the parentheses (like passing parameters into a regular function).

    The constructor will initialize the properties when you create an object of a class. Just remember to specify
    the type of the property/variable:
*/

class University(State: String, City: String, Zone: String, Period: Short, Shift: Char)

fun main() {
    val student1 = University("Amazonas", "Manaus", "Zone Center-Sul", 8, 'V')

    val student2 = University("Sao Paulo", "Guarulhos", "Zone Norte", 10, 'M')

    println("The students chose = $student1 and $student2")
}