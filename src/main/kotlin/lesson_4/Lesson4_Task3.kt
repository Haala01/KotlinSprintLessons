package sprint.lessons.lesson_4

const val TARGET_HUMIDITY = 20
const val FORBIDDEN_SEASON = "зима"

fun main () {

    val isSunny = true
    val isAwningOpen = true
    val currentHumidity = 20
    val currentSeason = "зима"
    val conditionsMet = isSunny
            && isAwningOpen
            && (currentHumidity == TARGET_HUMIDITY)
            && (currentSeason != FORBIDDEN_SEASON)

    println("Благоприятные ли условия сейчас для роста бобовых? $conditionsMet")

}