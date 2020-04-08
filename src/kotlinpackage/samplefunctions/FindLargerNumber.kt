package kotlinpackage.samplefunctions

fun main() {
    val list = listOf<Int>(10, 8, 5, 6, 7, 20, 30, 5, 2, 1)
    val result = findLarger(list)
    println("largerValue is $result")
}

private fun findLarger(list: List<Int>) : Int {
    var largerValue = list[0]
    for (i in list) {
        if (i > largerValue) {
            largerValue = i
        }
    }
    return largerValue
}