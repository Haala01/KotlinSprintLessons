package sprint.lessons.lesson_2

const val MINUTES_IN_AN_HOUR = 60

fun main () {

    val departureHour = 9
    val departureMinute = 39
    val travelTimeMinutes = 457

    val departureTotalMinutes = departureHour * MINUTES_IN_AN_HOUR + departureMinute
    val arrivalTotalMinutes = departureTotalMinutes + travelTimeMinutes
    val arrivalHour = arrivalTotalMinutes / MINUTES_IN_AN_HOUR
    val arrivalMinute = arrivalTotalMinutes % MINUTES_IN_AN_HOUR

    println(String.format("%02d:%02d", arrivalHour, arrivalMinute))

}