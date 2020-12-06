import kotlinx.serialization.*
import kotlinx.serialization.json.*

@Serializable
data class Student(val firstName: String, val lastName: String? = null)

fun main() {
    val json = Json.encodeToString(Student("Peter"))
    println(json)
}
