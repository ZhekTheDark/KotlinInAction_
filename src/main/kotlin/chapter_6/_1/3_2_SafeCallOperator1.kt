package chapter_6._1

class Employee(val name: String, val manager: Employee?)

fun managerName(employee: Employee): String? = employee.manager?.name

fun main() {
    val ceo = Employee("Da Boss", null)
    val developer = Employee("Bob", ceo)
    println(managerName(developer))
    println(managerName(ceo))
}