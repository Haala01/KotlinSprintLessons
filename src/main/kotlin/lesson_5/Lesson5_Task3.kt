package sprint.lessons.lesson_5

const val WINNING_NUM_1 = 4
const val WINNING_NUM_2 = 42

fun main() {

    println("Угадайте два числа от 0 до 42")
    print("Введите первое число: ")
    val userNum1 = readln().toInt()
    print("Введите второе число: ")
    val userNum2 = readln().toInt()

    val isFullWin = (userNum1 == WINNING_NUM_1 && userNum2 == WINNING_NUM_2) ||
            (userNum1 == WINNING_NUM_2 && userNum2 == WINNING_NUM_1)
    val isPartialWin = (userNum1 == WINNING_NUM_1 || userNum1 == WINNING_NUM_2) ||
            (userNum2 == WINNING_NUM_1 || userNum2 == WINNING_NUM_2)

    if (isFullWin)
        println("Поздравляем! Вы выиграли главный приз!")
    else if (isPartialWin)
        println("Вы выиграли утешительный приз!")
    else
        println("Неудача!")

    println("Выигрышные числа были: $WINNING_NUM_1 и $WINNING_NUM_2")
}