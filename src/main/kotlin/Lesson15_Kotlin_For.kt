fun loopsFor() {
    /*
        # Kotlin For Loop #

        Often when you work with arrays, you need to loop through all of the elements.

        To loop through array elements, use the for loop together with the in operator:
     */

    val socialMedias = arrayOf("Instagram", "Facebook", "WhatsApp", "Messenger", "Twitter", "TikTok", "LinkedIn")

    for (i in socialMedias){
        println(i)
    }

    /*
        # Traditional For Loop #

        Unlike Java and other programming languages, there is no traditional for loop in Kotlin.

        In Kotlin, the for loop is used to loop through arrays, ranges, and other things that contains a
        countable number of values.

        You will learn more about ranges in the next chapter - which will create a range of values.
     */

}

fun main() {
    loopsFor()
}