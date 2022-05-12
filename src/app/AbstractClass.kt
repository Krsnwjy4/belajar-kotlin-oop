package app

import data.Location // ERROR(Harus Class turunanya)

import data.City
import data.Country

fun main() {
    val city = City("Malang")
    val country = Country("Indonesia")

    println(city.name)
    println(country.name)

}