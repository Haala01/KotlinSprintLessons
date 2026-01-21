package sprint.lessons.lesson_2
fun main () {

    val regularEmployee = 50
    val regularSalary = 30000
    val internEmployee = 30
    val internSalary = 20000

    var costsForRegular: Int = regularEmployee * regularSalary
    var overallCosts: Int = costsForRegular + (internEmployee * internSalary)
    val totalEmployees: Int = regularEmployee + internEmployee
    val averageSalary: Int = overallCosts / totalEmployees

    println(costsForRegular)
    println(overallCosts)
    println(averageSalary)

}