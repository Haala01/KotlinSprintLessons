package sprint.lessons.lesson_5

fun main() {
    print("Введите ваш вес (кг): ")
    val weight = readln().toDouble()
    print("Введите ваш рост (см): ")
    val heightCm = readln().toDouble()
    val heightM = heightCm / 100
    val bmi = weight / (heightM * heightM)
    val category = when {
        bmi < 18.5 -> "Недостаточная масса тела"
        bmi < 25.0 -> "Нормальная масса тела"
        bmi < 30.0 -> "Избыточная масса тела"
        else -> "Ожирение"
    }

    println("Ваш ИМТ: %.2f".format(bmi))
    println("Категория: $category")
}