package data

class User(var username: String, var password: String) {
    override fun toString(): String {
        return "User with usernama=$username"

    }

}