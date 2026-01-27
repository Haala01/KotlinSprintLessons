package sprint.lessons.lesson_4

fun main () {

    val currentDay = 5
    val isArmsAbsDay = (currentDay %2) !=0
    val isLegsBackDay = !isArmsAbsDay

    println("""
        Упражнение для рук: $isArmsAbsDay
        Упражнение для ног: $isLegsBackDay
        Упражнение для спины: $isLegsBackDay
        Упражнение для пресса: $isArmsAbsDay
    """.trimIndent())

}