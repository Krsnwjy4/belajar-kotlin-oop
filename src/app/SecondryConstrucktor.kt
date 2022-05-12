package app

import data.Address

fun main() {
    val address1 = Address("Jalan A", "Malang")
    val address2 = Address("Jalan B", "Malang", "Indonesia")

    println(address1.street)
    println(address2.street)

}