package sprint.lessons.lesson_4

import java.util.Scanner

fun main () {

    val scanner = Scanner(System.`in`)

    println("Имеются ли повреждения корпуса? (true/false):")
    val isDamaged = scanner.nextBoolean()

    println("Введите текущий состав экипажа (число):")
    val crewCount = scanner.nextInt()

    println("Количество ящиков провизии (число):")
    val provisionCount = scanner.nextInt()

    println("Погода благоприятна? (true/false):")
    val isWeatherGood = scanner.nextBoolean()

    val canSail = (!isDamaged && (crewCount >= 55 && crewCount <= 70) && provisionCount > 50) || (crewCount == 70 && isWeatherGood && provisionCount >= 50)

    println("Корабль может отправиться в плавание: $canSail")
}