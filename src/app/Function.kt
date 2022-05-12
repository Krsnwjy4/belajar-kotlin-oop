package app

import data.Person

fun main() {
    val krisna = Person()
    krisna.firstName = "Wahyu"
    krisna.middleName = "Krisna"
    krisna.lastNamae = "Wijaya"

    krisna.sayHello("budi")
    krisna.run()

    val fullName = krisna.getFullName()
    println(fullName)

}