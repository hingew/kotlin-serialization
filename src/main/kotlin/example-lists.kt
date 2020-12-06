import kotlinx.serialization.*
import kotlinx.serialization.json.*

@Serializable
data class Student(val firstName: String)

fun main() {
    val list = listOf(
        Student("Peter"),
        Student("Klaus")
    )

    val json = Json.encodeToString(list)
    println(json)
}
