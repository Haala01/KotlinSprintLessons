package sprint.lessons.lesson_4

fun main () {

    val isSunny = true
    val isAwningOpen = true
    val humidity = 20
    val currentSeason = "зима"
    val conditionsMet = isSunny && isAwningOpen && (humidity == 20) && (currentSeason != "зима")

    println("Благоприятные ли условия сейчас для роста бобовых? $conditionsMet")

}