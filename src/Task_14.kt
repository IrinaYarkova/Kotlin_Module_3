fun main(args: Array<String>) {
    println("Введите информацию о сотруднике")
    println("ФИО:")
    var name: String? = readLine()
    println("Возраст:")
    var age: String? = readLine()
    println("Должность:")
    var position: String? = readLine()
    println("Семейное положение:")
    var maritalStatus: String? = readLine()

    printEmployeeInfo(name!!, position!!)
    printEmployeeInfo(name, age!!.toInt(), position)
    printEmployeeInfo(name, age, maritalStatus!!)
    printEmployeeInfo(name, age, maritalStatus, position)

}

fun printEmployeeInfo(name: String, position: String){
    println("ФИО: $name, Должность: $position")
}

fun printEmployeeInfo(name: String, age: Int, position: String){
    println("ФИО: $name, Возраст: $age, Должность: $position")
}

fun printEmployeeInfo(name: String, maritalStatus: String, position: String){
    println("ФИО: $name, Семейное положение: $maritalStatus, Должность: $position")
}

fun printEmployeeInfo(name: String, age: String, maritalStatus: String, position: String){
    println("ФИО: $name, Возраст: $age, Семейное положение: $maritalStatus, Должность: $position")
}