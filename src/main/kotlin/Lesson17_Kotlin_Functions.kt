/*
        # Resume:

        A function is a block of code which only runs when it is called.
        You can pass data, known as parameters, into a function.
        Functions are used to perform certain actions, and they are also known as methods.

        # Function Parameters:

        Information can be passed to functions as parameter.
        Parameters are specified after the function name, inside the parentheses. You can add
        as many parameters as you want, just separate them with a comma. Just note that you
        must specify the type of each parameter (Int, String, etc).
     */

fun identify(name: String, age: Short, gender: Char) {
    println("Your id is:")
    print("Name: $name \nAge: $age \nGender: $gender")
    print("\nYou're Welcome to Club Kotlin Developers!")

    /* Note: When working with multiple parameters, the function call must have the same number
     of arguments as there are parameters, and the arguments must be passed in the same order.

        # Return Values:

        In the examples above, we used functions to output a value. In the following example, we will
        use a function to return a value and assign it to a variable.

        To return a value, use the return keyword, and specify the return type after the function's
         parentheses (Int in this example function):
    */
}

fun calculator(n1: Short, n2: Short, n3: Short): Int {
    return (n1 * n2 + n3)

    /*
        # Shorter Syntax for Return Values:

        There is also a shorter syntax for returning values. You can use the = operator instead of return
        without specifying the return type. Kotlin is smart enough to automatically find out what it is:
     */
}

fun shorterSyntax(x: Float, y: Float) = x / y

fun main() {
    identify("Carlos Souza", 20, 'M')
    println("\nThe result of operations is = ${calculator(2, 4, 5)}")
    println("\nThe division of floats is = ${shorterSyntax(30.055f, 12.015f)}")
}