import kotlinx.serialization.*
import kotlinx.serialization.json.*

@Serializable
data class Student(val firstName: String)

fun main() {
    val map = mapOf(
        1 to Student("Peter"),
        2 to Student("Klaus")
    )

    val json = Json.encodeToString(map)
    println(json)
}
