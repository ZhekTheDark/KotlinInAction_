package chapter_5._2

data class Person(val name: String, val age: Int)

fun main() {
    val people = listOf(Person("Alice", 29), Person("Bob", 31))
    println(people.filter { it.age > 30 })
}