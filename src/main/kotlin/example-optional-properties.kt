import kotlinx.serialization.*
import kotlinx.serialization.json.*

@Serializable
data class Student(val firstName: String, val lastName: String = "Petersen")

fun main() {
    val json = Json.encodeToString(Student("Peter"))
 
    val student = Json.decodeFromString(("""
        { "firstName": "Peter" }
    """)

    println(json)
    println(student)
}