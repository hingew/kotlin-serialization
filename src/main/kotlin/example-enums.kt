import kotlinx.serialization.*
import kotlinx.serialization.json.*

@Serializable
enum class Status { APPROVED }

@Serializable
data class Student(val firstName: String, val status: Status)

fun main() {
    val json = Json.encodeToString(Student("Peter", Status.APPROVED))
    println(json)
}
