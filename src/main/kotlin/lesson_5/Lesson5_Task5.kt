package sprint.lessons.lesson_5

fun main() {

    val winningNumbers = (0..42).shuffled().take(3)
    println("Введите 3 числа от 0 до 42:")
    val userNumbers = mutableListOf<Int>()

    repeat(3) { index ->
        print("Число ${index + 1}:")
        val input = readln().toInt()
        userNumbers.add(input)
    }

    val matchedNumbers = winningNumbers.intersect(userNumbers.toSet())
    val matchCount = matchedNumbers.size
    println("\n--- Результат ---")
    when (matchCount) {
        3 -> println("Ура! Вы угадали все числа и выиграли джекпот!")
        2 -> println("Поздравляем! Вы угадали два числа и получаете крупный приз.")
        1 -> println("Вы угадали одно число. Вам полагается утешительный приз.")
        else -> println("Вы не угадали ни одного числа. Повезет в любви!")
    }

    println("Выигрышные числа были: $winningNumbers")

}