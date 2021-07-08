// In the previous chapter, we created a Kotlin file called Main.kt, and we used the following
// code to print "Hello World" to the screen...

/*
    Main Parameters:

Before Kotlin version 1.3, it was required to use the main() function with parameters,
like: fun main(args : Array<String>). The example above had to be written like this to work:
 */

fun messenger(){
    val msg = "Hy, How are you"
    println(msg)
}

fun main(){
    messenger()
}