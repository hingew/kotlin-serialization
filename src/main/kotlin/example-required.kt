import kotlinx.serialization.*
import kotlinx.serialization.json.*

@Serializable
data class Student(val firstName: String, @Required val lastName: String = "Petersen")

fun main() {
    val json = Json.encodeToString(Student("Peter", "Klaus"))
    println(json)
}
