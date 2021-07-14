package kotlin_oop

/*
    Kotlin Inheritance (Subclass and Superclass)
    In Kotlin, it is possible to inherit class properties and functions from one class to another.
    We group the "inheritance concept" into two categories:

    -> subclass (child) - the class that inherits from another class
    -> superclass (parent) - the class being inherited from

    In the example below, MyChildClass (subclass) inherits the properties from the 'MyEnterprise class' (superclass):
 */

open class MyEnterprise {

    var money = 15000000
    var employees = 10000
    var activity = arrayOf("Web", "Mobile", "DevOps", "BI")

}

class MyStartups: MyEnterprise() {

    fun sectorNum1() {

        var capital = money/5
        var directory = employees/10
        var functions = activity[0]

        print("\nCapital = $capital \nDirectory = $directory \nFunction Principal = $functions")
    }

    fun sectorNum2() {

        var capital = money/2
        var directory = employees/5
        var functions = activity[3]

        print("\nCapital = $capital \nDirectory = $directory \nFunction Principal = $functions")
    }

}

fun main() {
    val resume = MyStartups()

    println("\nThe Startup Board #1\n ${resume.sectorNum1()}")
    println("\nThe Startup Board #2\n ${resume.sectorNum2()}")
}

/*
    Use the open keyword in front of the superclass/parent, to make this the class other classes
    should inherit properties and functions from.

    To inherit from a class, specify the name of the subclass, followed by a colon :, and then
    the name of the superclass.
 */