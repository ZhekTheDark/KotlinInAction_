package chapter_5._2

fun main() {
    val people = listOf(Person("Alice", 27), Person("Bob", 31))
    println(people.count(canBeInClub27))
    println(people.find(canBeInClub27))
    println(people.find { p:Person -> p.age <= 27 })
    println(people.find { it.age <= 27 })
}