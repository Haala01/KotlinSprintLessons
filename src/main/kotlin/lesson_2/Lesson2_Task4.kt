package sprint.lessons.lesson_2

const val BUFF_PERCENTAGE = 20 // + 20% бафа

fun main () {

    val crystalWithoutBuff = 7
    val ironWithoutBuff = 11

    val crystalWithBuff = (crystalWithoutBuff * BUFF_PERCENTAGE) / 100
    val ironWithBuff = (ironWithoutBuff * BUFF_PERCENTAGE) / 100

    println("Бафф дя кристаллической руды: $crystalWithBuff")
    println("Бафф дя железной руды: $ironWithBuff")
}