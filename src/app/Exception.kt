package app

import exception.ValidationException

fun validateAndSayHello(name: String){
    if(name.isBlank()) {
        throw ValidationException("NAME IS BLANK!!")

    }else {
        println("Hello $name")

    }

}

fun main() {
    try {
        validateAndSayHello("Krisna")
//        validateAndSayHello("")
        println("Program")

    }catch (error: ValidationException) {
        println("ERROR ${error.message}")

    }catch (error: Throwable) {
        println("ERROR ${error.message}")

    }finally {
        println("Program Selesai")
    }

}