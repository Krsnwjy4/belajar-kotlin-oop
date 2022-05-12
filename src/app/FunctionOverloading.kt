package app

import data.Person

fun main() {
    val krsn = Person()
    krsn.firstName = "Krisna"

    krsn.sayHello("Rovalina")
    krsn.sayHello("Eric", "Wisnu")

}