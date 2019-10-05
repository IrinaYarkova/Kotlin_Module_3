fun main(args: Array<String>) {
    println("Ввендите год:")
    var year: String? = readLine()
    checkLeapYear(year!!.toInt())
}

fun checkLeapYear (year: Int){
    if (year%4 == 0){
        println("$year год - високосный")
    }else println("$year год - не високосный")
}
