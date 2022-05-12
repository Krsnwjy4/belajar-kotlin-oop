package app

import data.MyBase
import data.MyBaseDelegate

fun main() {
    val base = MyBase()
    base.sayHello("Krisna")

    val baseDelegate = MyBaseDelegate(base)
    baseDelegate.sayHello("Wijaya")
    baseDelegate.sayGoodbye("Restu")

}