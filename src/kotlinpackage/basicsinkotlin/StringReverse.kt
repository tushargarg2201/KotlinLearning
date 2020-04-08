package kotlinpackage.basicsinkotlin

fun main() {
    val result = stringReverse("Kotlin")
    println("result after reversing string $result")
}

private fun stringReverse(str: String) : String {
    val length = str.length
    var i = 0;
    var j = length - 1;
    val charArray = str.toCharArray()
    val stringBuffer = StringBuffer()

    while (i < j) {
        val char = charArray[i]
        charArray[i] = charArray[j]
        charArray[j] = char
        i++
        j--
    }
    for(k in charArray) {
        stringBuffer.append(k)
    }
    return stringBuffer.toString()
}