package sprint.lessons.lesson_2

import kotlin.math.pow

const val RATE_PERCENTAGE = 16.7

fun main () {

    val client = 70_000
    val years = 20

    val base = 1 + RATE_PERCENTAGE / 100
    val finalAmount = client * base.pow(years)
    println("%.3f".format(finalAmount))

}