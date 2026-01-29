package sprint.lessons.lesson_5

fun main() {

    val number1 = (1..10).random()
    val number2 = (1..10).random()
    val sum = number1 + number2

    println("Для входа докажите, что вы не бот.")
    println("Сколько будет $number1 + $number2?")

    val userAnswer = readln().toInt()
    if (userAnswer == sum)
        println("Добро пожаловать!")
    else
        println("Доступ запрещен.")

}