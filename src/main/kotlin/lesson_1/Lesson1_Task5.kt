package sprint.lessons.lesson_1

fun main () {


    val totalSeconds = 6480
    var hours = totalSeconds / 3600
    var minutes = (totalSeconds % 3600) / 60
    var seconds = totalSeconds % 60

    println("%02d:%02d:%02d" .format (hours, minutes, seconds))

}