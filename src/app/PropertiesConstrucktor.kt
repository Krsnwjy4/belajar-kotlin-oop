package app

import data.User

fun main() {
    val user1 = User("krisna", "rahasia")
    val user2 = User("wijaya", "rahasia123")

    user1.username = "wahyu"
    user1.password = "krisna123"

    println(user1.username)
    println(user1.password)

    println(user2.username)
    println(user2.password)

}