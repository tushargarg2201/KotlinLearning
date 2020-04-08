package kotlinpackage.samplefunctions

/**
 * This program will remove first and last character from the String in the kotlin.
 * E.g We have a string "Kotlin". It will remove K and n from the string and output will be
 * output -> otli
 */
fun main() {
    val str = "Kotlin"
    val result = str.removeFirstAndLastChar()
    println("result is $result")
}

/**
 * Please note, below function works as an expression.
 * In the below function this is a "Kotlin" string which passed from main function
 */
private fun String.removeFirstAndLastChar() = this.substring(1, this.length - 1)
