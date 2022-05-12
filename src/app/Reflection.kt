package app

import data.CreateCatagoryRequest
import data.CreateProductRequest
import exception.ValidationException


fun validateRequest(request: CreateProductRequest) {
    if (request.id == "") {
        throw ValidationException("Id is blank")
    }else if (request.name == "") {
        throw ValidationException("Name is blank")
    }

}
fun validateRequest(request: CreateCatagoryRequest) {
    if (request.id == "") {
        throw ValidationException("Id is blank")
    }else if (request.name == "") {
        throw ValidationException("Name is blank")
    }

}
//fun validateRequest(request: Any) {
//    val clazz = request::class
//    val properties = clazz.memberProperties //memberProperties is error
//
//}
fun main() {
    val request = CreateProductRequest("1", "Indomie", 2000)
    validateRequest(request)
    
}