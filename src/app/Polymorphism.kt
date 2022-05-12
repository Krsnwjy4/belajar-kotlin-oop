package app

import data.Employee
import data.Manager
import data.VicePresident

fun main() {
    var employee: Employee = Employee("Krisna")
    employee.sayHello("Eric")

    employee = Manager("Krisna")
    employee.sayHello("Eric")

    employee = VicePresident("Krisna")
    employee.sayHello("Eric")

}