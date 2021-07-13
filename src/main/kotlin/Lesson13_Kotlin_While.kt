fun testWhile() {
    // Study Cases of Loop While():

    /*
        The while loop loops through a block of code as long as a specified condition is true:

        The do..while loop is a variant of the while loop. This loop will execute the code block once,
        before checking if the condition is true, then it will repeat the loop as long as the condition is true.

        NOTE : Do not forget to increase the variable used in the condition, otherwise the loop will never end!

        Examples:
     */

    var numTest = 15

    print("Started the Loops:\n")

    while (numTest < 20){
        println(numTest)
        numTest++
    }

    print("\nOther Loop:\n")

    do {
        println(numTest)
        numTest++
    } while (numTest < 25)
}

fun connections() {
    // Kotlin have 2 connections: The 'break' and 'continue'.

    /*
        The break statement is used to jump out of a loop.

        The continue statement breaks one iteration (in the loop), if a specified condition occurs,
        and continues with the next iteration in the loop.

        Examples:
     */

    var numberT = 1

    while (numberT < 10) {
        println(numberT)
        if (numberT == 6) {
            break
            // Here, The loop stopped in number 5
        }
        numberT++
    }

    print("\nOther Loop:\n")

    do {
        numberT++
        if (numberT == 13) {
            break
            // Here, The loop stopped in number 5
        }
        println(numberT)
    } while (numberT < 15)

}

fun main() {
    //testWhile()
    connections()
}