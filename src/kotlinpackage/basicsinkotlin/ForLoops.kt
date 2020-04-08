package kotlinpackage.basicsinkotlin

import java.util.*

fun main() {
    // Sum of 1 to 100.
    var sum = 0;
    for (i in 1 .. 100) {
        sum += i
    }
    println("sum is--> $sum")

     //print 10 to 1
    for (i in 10 downTo 1) {
        println(i)
    }

    // print step 2

    for (i in 1.. 10 step 2) {
        println ("step 2  $i")
    }

    for (i in 1 until 6 step 1) {
        println("value of i $i")
    }

    val numbers = listOf(1, 2, 3, 4, 5)
    for (i in numbers) {
        println("list numbers are $i")
    }

    val ages = TreeMap<String, Int>()
    ages["Tushar"] = 10
    ages["Amit"] = 20
    ages["Anil"] = 5
    ages["Ravi"] = 30

//    for ((name, age) in  ages) {
//        println("$name is $age")
//    }
//
//    for (entry in ages) {
//        println("${entry.key}: ${entry.value}")
//    }
//
    // iterate over keys
    for (key in ages.keys) {
        println("$key")
    }

    // iterate over keys
    for (value in ages.values) {
        println("$value")
    }


}