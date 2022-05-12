package app

import data.ExecutiveCustomer
import data.PremiumCustomer

fun main() {
    val premiumCustomer = PremiumCustomer("Krisna")
    println(premiumCustomer.name)

    val executiveCustomer = ExecutiveCustomer("Krisna", 10000000)
    println(executiveCustomer.name)
    println(executiveCustomer.balance)

}