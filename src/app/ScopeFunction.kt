package app

import data.Student

fun main() {
    val student = Student("Krisna", 15)
    val result: String = student.let {
        "My name is ${it.name}, and my age ${it.age}"

    }
    println(result)

    val result2: String = student.run {
        "Name ${this.name}, Age ${this.age}"

    }
    println(result2)

    val result3: Student = student.apply {
        "My name is ${this.name}, and my age ${this.age}"

    }
    println(result3)

    val result4: Student = student.also {
        "Name ${it.name}, Age ${it.age}"

    }
    println(result4)

    val result5: String = with(student) {
        "Name ${this.name}, Age ${this.age}"

    }
    println(result5)

}