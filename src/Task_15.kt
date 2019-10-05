fun main(args: Array<String>) {
    var arr = arrayOf("Алексей", "Светлана", "Никита", "Олег", "Алексей", "Светлана")
    val printer = {array: Array<String> -> for(element in array) println(element)}
    printer(arr)

}