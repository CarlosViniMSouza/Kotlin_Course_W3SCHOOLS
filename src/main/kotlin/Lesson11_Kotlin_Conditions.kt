fun testConditions() {
    // Kotlin Conditions in tomorrow!

    //For the sake of brevity, I'll just put the 'else if' and 'when' type condition structure.

    /*
            if (condition1) {
              // block of code to be executed if condition1 is true
            } else if (condition2) {
              // block of code to be executed if the condition1 is false and condition2 is true
            } else {
              // block of code to be executed if the condition1 is false and condition2 is false
            }

            Example:
     */

    var num1 = 10
    var num2 = 15

    if (num2 <= num1) {
        println("$num1 is greater than $num2")
    } else if (num2 == num1) {
        println("$num1 is equal to $num2")
    } else {
        println("$num2 is greater than $num1")
    }

    /*
        When using if as an expression, you must also include else (required).

        Note: You can omit the curly braces {} when if has only one statement. Example:
     */

    var num3 = if (num1 == 10 && num2 < 20) "both are in range [10, 20]" else "both are at different intervals"
    println(num3)
    // Yes, you can also use if..else statements as expressions (assign a value to a variable and return it)!
}

fun main() {
    testConditions()
}