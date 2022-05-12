package app

import data.Application

typealias App = Application
typealias Aplikasi = App
typealias App2 = data2.Application

typealias StringSupplier = () -> String

fun sayHello(supplier: StringSupplier){
    println("Hello ${supplier()}")

}

fun main() {
    val app = App("kotlin App")
    val aplikasi = Aplikasi("Kotlin App v2")
    val app2 = App2("Kotlin App v3")

    sayHello { "Krisna" }

}