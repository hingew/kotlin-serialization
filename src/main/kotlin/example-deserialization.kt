import kotlinx.serialization.*
import kotlinx.serialization.json.*

@Serializable
data class Student(val firstName: String)

fun main() {
    val student = Json.decodeFromString<Student>("""
        {"firstName" : "Peter"}
    """)
    println(student)
}
