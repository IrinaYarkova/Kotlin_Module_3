fun main(args: Array<String>) {
    var employees = arrayOf("Алексей", "Светлана", "Никита", "Олег", "Алексей", "Светлана")
    println("Всего сотрудников " + countEmployees(*employees))
}

fun countEmployees(vararg employees: String): Int {
    var count = 0
    for(employee in employees){
        count++
    }
    return count
}