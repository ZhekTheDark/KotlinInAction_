package chapter_5._2

val canBeInClub27 = { p:Person -> p.age <= 27 }

fun main() {
    val people = listOf(Person("Alice", 27), Person("Bob", 31))
    println(people.all(canBeInClub27))
    println(people.any(canBeInClub27))
}