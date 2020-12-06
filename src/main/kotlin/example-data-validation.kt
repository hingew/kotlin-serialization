import kotlinx.serialization.*
import kotlinx.serialization.json.*

@Serializable
data class Student(val firstName: String) {
    init {
        require(firstName.isNotEmpty()) { "firstName cannot be empty!" }
    }
}

fun main() {
    val student = Json.decodeFromString<Student>("""
    { "firstName": ""}
    """)

    println(student)
}
