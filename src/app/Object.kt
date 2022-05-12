package app

import data.Person

fun main() {
    val wahyu = Person()
    wahyu.firstName = "Wahyu"
    val krisna = Person()
    krisna.firstName = "Krisna"
    val wijaya = Person()
    wijaya.firstName = "Wijaya"

    println(wahyu.firstName)
    println(krisna.firstName)
    println(wijaya.firstName)

}