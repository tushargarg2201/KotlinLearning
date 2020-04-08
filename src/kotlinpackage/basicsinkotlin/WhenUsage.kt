package kotlinpackage.basicsinkotlin

fun main() {
    var number = Number()
    val student = Students()

    //Works as a Statements
    when(number.x) {
        1-> println("Number is 1")
        2-> println("Number is 2")
        else -> {
            println("Number is neither 1 nor 2")
        }
    }

    //100 Marks exam

    //1-30 failed
    //30-50 //passed third divisio
    //50-60// passed with 2nd division
    //60-75 passed
    


    // replaces with multiple if/else statements
    when {
        isOdd() -> println ("It an odd Number")
        isEven() -> println("It an Even Number")
        else -> {
            println("Funny Number")
        }
    }

    //Works with range
    when(student.passingMarks) {
        in 1..50 -> println("failed")
        in 51..100 -> println("passed")
        else -> {
            println("don't know the result")
        }
    }



}

fun isOdd(): Boolean {
    val num = Number()
    return num.x % 2  > 0
}

fun isEven(): Boolean {
    val num = Number()
    return num.x % 2 == 0
}

class Students {
    var passingMarks = 50
}

class Number {
    var x = 1
}