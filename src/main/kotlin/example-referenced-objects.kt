import kotlinx.serialization.*
import kotlinx.serialization.json.*

@Serializable
data class Course(val title: String, val student: Student)

@Serializable
data class Student(val firstName: String)

fun main() {
    val student = Student("Peter")
    val course = Course("Web", student)

    val json = Json.encodeToString(course)
    println(json)
}
