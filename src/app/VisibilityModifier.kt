package app

import data.SuperTeacher
import data.Teacher

fun main() {
    val teacher = SuperTeacher("Krisna")
    println(teacher.name)
    //  teacher.teach() // ERROR
    teacher.test()

}