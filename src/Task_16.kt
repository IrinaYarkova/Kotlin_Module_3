import kotlin.math.sqrt

fun main(args: Array<String>) {

    fun Double.sqrt(): Double {
        return sqrt(this)
    }

    println("Введите число для нахождения квадратного корня:")
    var input: String? = readLine()

    var a = input!!.toDouble()
    println("Квадратный корень $a = " + a.sqrt())

}