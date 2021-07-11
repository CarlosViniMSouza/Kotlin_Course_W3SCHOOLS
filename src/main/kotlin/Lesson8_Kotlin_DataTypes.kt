import kotlin.reflect.typeOf

fun dataTypes(){
    val number = 10                                 // Integer
    val numberDouble = 10.01                        // Double
    val numberFloat = 10.05f                        // Float --> For distinguish Double and Float, put the letter 'f'
    val valueBoolean = true                         // Boolean
    val char = "D"                                  // Char
    val charLinked = "Data Types is Important!"     // String

    println("This function have anyone types of data: \n")

    print(" $number \n $numberDouble \n $numberFloat \n $valueBoolean \n $char \n $charLinked \n")
}

fun detailsNumbers(){
    /*
    Number types are divided into two groups:

    Integer types store whole numbers, positive or negative ex.: 123, -456, 10934), without decimals.
    Valid types are:
        #Byte,
        #Short,
        #Int,
        #Long

    Floating point types represent numbers with a fractional part, containing one or more decimals.
    There are two types:
       #Float,
       #Double

    This can be used instead of Int or other integer types to save memory when you are certain
    that the value will be within -128 and 127:
     */

    val numberByte: Byte = 105
    println(numberByte)

    // The Short data type can store whole numbers from [-32768, 32767]:

    val numberShort: Short = 10000
    println(numberShort)

    // The Int data type can store whole numbers from [-2147483648, 2147483647]:

    val numberInt: Int = 900000
    println(numberInt)

    // Warning = The Long data type can store whole numbers from -9223372036854775808 to 9223372036854775808.
    // This is used when Int is not large enough to store the value. you CAN end the value with an "L":

    val numberLong: Long = 109876543210123456L
    println(numberLong)

    // The Float data type can store fractional numbers from 3.4e−038 to 3.4e+038.
    // NOTE = that you should end the value with an "F":

    val numberFloat: Float = 200000f
    println(numberFloat)

    // The Double data type can store fractional numbers from 1.7e−308 to 1.7e+038:
    val numberDouble = 200000.05
    println(numberDouble)

    /*
        # Use Float or Double?

        The precision of Float is only six or seven decimal digits, while Double variables
        have a precision of about 15 digits.
        It's recommended to use the type Double!
     */

    /*
        # Scientific Numbers:

        A floating point number can also be a scientific number with an "e" or "E"
        to indicate the power of 10:
     */

    val myNumSci1: Float = 30E3F
    val myNumSci2: Double = 20E4
    println("$myNumSci1 \n $myNumSci2")
}

fun boolAndCharsAndString(){
    /*
        The Boolean data type and can only take the values true or false
        # true -> condition satisfied
        # false -> condition not-satisfied
     */

    val numberIsPar = true
    val numberIsOdd = false
    println("$numberIsPar \n $numberIsOdd")

    // The Char data type is used to store a single character.

    val oneLetter = 'F'
    println(oneLetter)

    // The String data type is used to store a sequence of characters (text)

    val oneString = "FreeFire_Fortnite_PUBG"
    println(oneString)

}

fun typeConversion(){
    /*
        Type Conversion:

        Type conversion is when you convert the value of one data type to another type.
        To convert a numeric data type to another type, you must use one of the following functions:

         --> toByte(), toShort(), toInt(), toLong(), toFloat(), toDouble() or toChar(): <--
     */

    val num: Short = 10
    val num2: Long = num.toLong()

    println("Now, $num Is a Short Int")
    println("Now, $num2 Is a Long Int")
}

fun main(){
    dataTypes()
    detailsNumbers()
    boolAndCharsAndString()
    typeConversion()
}

// Tomorrow I continue ...