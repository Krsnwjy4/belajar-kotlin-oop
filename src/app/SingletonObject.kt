package app

import data.Application
import data.Utilities

fun main() {
    Utilities.name = "Dirubah"
    println(Utilities.toUpper("hermawan"))
    a()
    b()

    println(Application.Companion.toUpper("Singuda"))

}
fun a() {
    println(Utilities.name)

}
fun b() {
    println(Utilities.name)

}