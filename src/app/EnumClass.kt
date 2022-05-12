package app

import data.Gender

fun main() {
    val man = Gender.MALE
    val woman = Gender.FEMALE
    val allGanders: Array<Gender> = Gender.values()

    val manForString = Gender.valueOf("MALE")
    val womanForString =Gender.valueOf("FEMALE")

    println(man)
    println(woman)
    println(allGanders.toList())

    man.showDescription()
    woman.showDescription()

}