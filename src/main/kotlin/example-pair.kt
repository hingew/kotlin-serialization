import kotlinx.serialization.*
import kotlinx.serialization.json.*

@Serializable
data class Student(val firstName: String, val status: Status)

fun main() {
    val pair = 1 to Student("Peter")
    val json = Json.encodeToString(pair)

    println(json)
}
