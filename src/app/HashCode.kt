package app

import data.Company

fun main() {
    val company1 = Company("krsn")
    val company2 = Company("krsn")

    println(company1.hashCode())
    println(company2.hashCode())
    println(company1.hashCode() == company2.hashCode())

}