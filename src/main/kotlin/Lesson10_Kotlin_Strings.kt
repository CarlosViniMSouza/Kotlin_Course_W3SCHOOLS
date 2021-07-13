fun stringsModel(){
    /*
        Strings are used for storing text. A string contains a collection of characters surrounded by double quotes:

        Example:
     */

    var thisString: String  = "This is a String in Kotlin"
    var thisStringN2: String = "Java is better than Kotlin! LOOOL"

    println("Invoked the variable: $thisString")

    /*
        # Access a String #

        To access the characters (elements) of a string, you must refer to the index number inside square brackets.

        Example:
     */

    println(thisString.slice(0..4)) // --> Yes, here I needed to use a method !

    /*
        # String Length #

        The length of a string can be found with the length property. Example:
     */

    println("This is string contain: " + thisString.length + " characters")

    /*
        # String Functions #

        There are many string functions available, for example:

        - toUpperCase() --> Capitalize all letters.
        - toLowerCase() --> Leave all letters in lowercase.

     */

    println(thisString.uppercase())
    println(thisString.lowercase())

    // The compareTo(string) function compares two strings and returns 0 if both are equal:

    println(thisString.compareTo(thisStringN2))

    // The indexOf() function returns the index (the position) of the first occurrence of a
    // specified text in a string (including whitespace):

    println(thisString.indexOf("Kotlin"))
    println(thisStringN2.indexOf("Java"))

    // To use quotes inside a string, use single quotes (''):

    // The + operator can be used between strings to add them together to make a new string. Example:

    println(thisString + "\t" + thisStringN2)

    // You can also use the plus() function to concatenate two strings:

    println(thisString.plus("\t" + thisStringN2))

    // you can also use 'string templates'. Just refer to the variable with the '$' symbol. Example:

    println("Concatenate: $thisString and $thisStringN2")

    // 'String Templates' is a popular feature of Kotlin, as it reduces the amount of code.

}

fun main(){
    stringsModel()
}