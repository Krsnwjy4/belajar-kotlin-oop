package app

import data.Student
import data.sayHello
import data.upperName

fun main() {
    val student: Student? = Student("Krisna", 15)
    student.sayHello("Eric")
    println(student?.upperName)

}