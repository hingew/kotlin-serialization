import kotlinx.serialization.*
import kotlinx.serialization.json.*

@Serializable
data class Student(val firstName: String)

fun main() {
    val dataSet = setOf(
        Student("Peter"),
        Student("Klaus")
    )

    val json = Json.encodeToString(dataSet)
    println(json)
}
