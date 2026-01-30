package sprint.lessons.lesson_4

import java.util.Scanner

const val MIN_CREW = 55
const val RECOMMENDED_CREW = 70
const val MIN_PROVISIONS_EXCLUSIVE = 50
const val MIN_PROVISIONS_INCLUSIVE = 50

fun main () {


    println("Имеются ли повреждения корпуса? (true/false):")
    val isDamaged = readln().toBoolean()

    println("Введите текущий состав экипажа (число):")
    val crewCount = readln().toInt()

    println("Количество ящиков провизии (число):")
    val provisionCount = readln().toInt()

    println("Погода благоприятна? (true/false):")
    val isWeatherGood = readln().toBoolean()

    val canSail = (!isDamaged && (crewCount >= MIN_CREW && crewCount <= RECOMMENDED_CREW) && provisionCount > MIN_PROVISIONS_EXCLUSIVE)
            ||
            (crewCount == RECOMMENDED_CREW && isWeatherGood && provisionCount >= MIN_PROVISIONS_INCLUSIVE)

    println("Корабль может отправиться в плавание: $canSail")
}