package sprint.lessons.lesson_3

fun main () {

    val data = "D2-D4;0"
    val parts = data.split("-", ";")
    val from = parts[0]
    val to = parts[1]
    val moveNumber = parts[2]

    println("Ход откуда: $from")
    println("Ход куда: $to")
    println("Номер хода: $moveNumber")

}