package sprint.lessons.lesson_5

const val AGE_OF_MAJORITY = 18
const val CURRENT_YEAR = 2026

fun main() {

    println("Введите ваш год рождения:")

    val birthYear = readln().toInt()
    val currentAge = CURRENT_YEAR - birthYear

    if (currentAge >= AGE_OF_MAJORITY)
        println("Показать экран со скрытым контентом")
    else
    println("Доступ к скрытому контенту запрещен. Вам всего $currentAge.")
}
