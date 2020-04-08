package kotlinpackage.basicsinkotlin
fun main() {
    val student = Student()

    // Normal if/else condition without statement. It's similar to Java.
    if (student.passingMarks > 50) {
        println ("Student is passed")
    } else {
        println("Student is failed")
    }

    val message = if (student.passingMarks > 50) "Student is passed" else "Student is failed"
    println ("Message is ---> $message")

}

class Student {
    var passingMarks = 60
}