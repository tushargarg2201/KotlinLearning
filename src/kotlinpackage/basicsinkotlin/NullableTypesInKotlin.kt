package kotlinpackage.basicsinkotlin
fun main() {
    val organization = Organization()
    println("Name is ${organization.name}")
    println("EmpFirstName is ${organization.empFirstName}")
    println("EmpMiddleName is ${organization.empMiddleName}")

    organization.empMiddleName = null
    println("empMiddleName is ${organization.empMiddleName}")
}

class Organization {
    var name = "NousInfoSystem"
    var empFirstName = "Amit"
    var empMiddleName: String? = "Kumar"
}