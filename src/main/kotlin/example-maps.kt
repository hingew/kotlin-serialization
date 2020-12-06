import kotlinx.serialization.*
import kotlinx.serialization.json.*

@Serializable
data class Student(val firstName: String)

fun main() {
    val dataMap = mapOf(
        1 to Student("Peter"),
        2 to Student("Klaus")
    )

    val json = Json.encodeToString(dataMap)
    println(json)
}
