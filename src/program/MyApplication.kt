package program

import annotations.Fancy


@Fancy(author = "Krisna")
class MyApplication(val name: String, val version: Int) {
    fun info(): String = "Application $name - v$version"

}