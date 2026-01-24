package sprint.lessons.lesson_2

fun main () {

    val studen1 = 3
    val studen2 = 4
    val studen3 = 3
    val studen4 = 5
    val studentCount: Int = 4

    val averageStudents = studen1 + studen2 + studen3 + studen4
    val averageCount = averageStudents.toFloat() / studentCount

    println(message = String.format("%.2f", averageCount))

}