package app

data class Friend(val name: String)

fun sayHello(friend: Friend?) {
//    if(friend != null) {
//        println("Hello ${friend.name}")
//
//    }

//    println("Hello ${friend?.name}")

//    val name = friend?.name ?: "Prend"
//    println("Hello $name")

    val notNullFriend = friend!!
    val name = notNullFriend.name
    println("Hello $name")

}
fun main() {
    sayHello(Friend("Krisna"))
    sayHello(null) //ERROR

}