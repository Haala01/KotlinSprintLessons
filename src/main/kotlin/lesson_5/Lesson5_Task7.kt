package sprint.lessons.lesson_5


fun main() {
    println("--- Калькулятор топлива v2.0 (Safe Mode) ---")

    try {

        print("Введите расстояние поездки (км): ")
        val distance = readln().toDouble()
        print("Введите расход топлива на 100 км (л): ")
        val consumptionPer100Km = readln().toDouble()
        print("Введите текущую цену за литр: ")
        val pricePerLiter = readln().toDouble()
        if (distance < 0 || consumptionPer100Km < 0 || pricePerLiter < 0) {
            throw IllegalArgumentException("Числа не могут быть отрицательными!")
        }

        val totalFuel = (distance * consumptionPer100Km) / 100
        val totalCost = totalFuel * pricePerLiter
        println("\n--- Результаты расчета ---")
        println("Общее количество топлива: %.2f л".format(totalFuel))
        println("Итоговая стоимость поездки: %.2f".format(totalCost))

    } catch (e: NumberFormatException) {
        println("\n[ОШИБКА] Некорректный формат данных!")
        println("Пожалуйста, вводите только числа. Используйте точку для дробных чисел (например, 10.5).")

    } catch (e: IllegalArgumentException) {
        println("\n[ОШИБКА] ${e.message}")

    } catch (e: Exception) {
        println("\n[КРИТИЧЕСКАЯ ОШИБКА] Что-то пошло не так: ${e.message}")
    }
}