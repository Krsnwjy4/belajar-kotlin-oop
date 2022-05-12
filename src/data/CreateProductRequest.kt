package data

import annotations.NotBlank

data class CreateProductRequest(
    @NotBlank val id: String,
    @NotBlank val name: String,
    val price: Long

)
data class CreateCatagoryRequest(
    @NotBlank val id: String,
    @NotBlank val name: String

)