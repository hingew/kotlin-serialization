import kotlinx.serialization.*
import kotlinx.serialization.json.*

@Serializable
class Box<T>(val contents: T)

@Serializable
data class Student(val firstName: String)

@Serializable
class Data(
    val number: Box<Int>,
    val student: Box<Student>
)


fun main() {
    val dataBox = Data(Box(42), Box(Student("Peter"))

    val json = Json.encodeToString(dataBox)

    println(json)
}
