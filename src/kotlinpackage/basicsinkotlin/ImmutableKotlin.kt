package kotlinpackage.basicsinkotlin
fun main() {
    val obj = Question();
    println(obj.ques)
    println(obj.ans)

    obj.ques = "How is Java?"
    obj.ans = "Java is easy to Learn"

    println(obj.ques)
    println(obj.ans)
}

class Question {
    var ques = "How is Kotlin?"
    var ans = "Kotlin is easy to learn"
}