fun loopRange() {
    /*
        With the for loop, you can also create ranges of values with ".."; Example:
     */

    for (char in 'a'..'x') {
        println(char) //will print the entire alphabet
    }

    print("\n") // You can also create ranges of numbers:

    for (nums in 5..30) {
        println(nums) //will print numbers to 5 still 30
    }

    // Note: The first and last value is included in the range.
}

fun main() {
    loopRange()
}