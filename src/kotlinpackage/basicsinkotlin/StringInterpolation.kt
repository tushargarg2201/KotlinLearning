package kotlinpackage.basicsinkotlin
fun main() {
    val emp = Employee()
    val age = 30
    val address = "Akshay Nagar"

    println("Age is $age")
    println("Address is $address")
    println("Emp Name is ${emp.name}")
}

class Employee {
   val name = "Amit"
}