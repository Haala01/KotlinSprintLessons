package sprint.lessons.lesson_3

fun main () {

    var from = "E2"
    var to = "E4"
    var moveNumber = 1

    var serverPayload = "[$from-$to,$moveNumber]"
    println(serverPayload)

    from = "D2"
    to = "D3"
    moveNumber = 2

    serverPayload = "[$from-$to,$moveNumber]"
    println(serverPayload)

}