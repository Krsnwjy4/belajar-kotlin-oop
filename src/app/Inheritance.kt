package app

import data.Manager
import data.VicePresident

fun main() {
    val manager = Manager("Krisna")
    manager.sayHello("Eric")

    val vicePresident = VicePresident("Eric")
    vicePresident.sayHello("Krisna")

}