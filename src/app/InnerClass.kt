package app

import data.Boss

fun main() {
    val boss1 = Boss("Wahyu")
    val employee1 = boss1.Employee("Krisna")
    val employee2 = boss1.Employee("Wijaya")

    val boss2 = Boss("Eric")
    val employee3 = boss2.Employee("Wisnu")
    val employee4 = boss2.Employee("Baskara")

    employee1.hi()
    employee2.hi()
    employee3.hi()
    employee4.hi()

}