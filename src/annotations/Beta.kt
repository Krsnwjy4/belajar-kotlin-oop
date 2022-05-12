package annotations

@Target(
    AnnotationTarget.PROPERTY_GETTER,
    AnnotationTarget.VALUE_PARAMETER,
    AnnotationTarget.FIELD

)
@Retention(AnnotationRetention.RUNTIME)
@MustBeDocumented

annotation class Beta()

class ExampleTarget(
    @field:Beta val firstNeme: String,
    @get:Beta val middleName: String,
    @param:Beta val lastName: String

)
