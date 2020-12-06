import kotlinx.serialization.*
import kotlinx.serialization.json.*

@Serializable
data class Student(val firstName: String)

fun main() {
    val json = Json.encodeToString(Student("Peter"))
    println(json)
}
