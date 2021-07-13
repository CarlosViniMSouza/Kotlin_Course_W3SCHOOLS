fun proofArrays() {
    /*
        Kotlin Arrays
        Arrays are used to store multiple values in a single variable, instead of creating separate
        variables for each value.

        To create an array, use the arrayOf() function, and place the values in a comma-separated
        list inside it.
     */

    var listAny = arrayOf("Medicine", "Law", "Engineering", "Social Science", "Administration", "Marketing")

    println("My course preference is: " + listAny[2])

    // To find out how many elements an array have, use the size property:

    print("The length this array is: " + listAny.size + "\n")

    // You can use the in operator to check if an element exists in an array:

    if ("Administration" in listAny) {
        println("Ok, We have your course!")
    } else {
        println("Sorry, we haven't this course!")
    }

    // You can loop through the array elements with the for loop, which you will learn
    // even more about in the next chapter.

    for (courses in listAny) {
        println(courses)
    }
}

fun main() {
    proofArrays()
}