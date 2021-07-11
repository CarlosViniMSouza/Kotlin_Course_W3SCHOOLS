fun stringsModel(){
    /*
        Strings are used for storing text. A string contains a collection of characters surrounded by double quotes:

        Example:
     */

    var thisString: String  = "This is a String in Kotlin"

    println("Invoked the variable: $thisString")

    /*
        # Access a String #

        To access the characters (elements) of a string, you must refer to the index number inside square brackets.

        Example:
     */

    println(thisString.slice(0..4)) // --> Yes, here I needed to use a method !

    /*
        I'll complete Lesson 10 later ... Next topic = String Length
     */

}

fun main(){
    stringsModel()
}