package chapter_5._1

fun main() {
    val people = listOf(Person("Alice", 29), Person("Bob", 31))
    var names = people.joinToString(separator = " ", transform = { p: Person -> p.name })
    println(names)

    names = people.joinToString(" ") { p: Person -> p.name }
    println(names)

    println(people.maxBy { p -> p.age })
    println(people.maxBy { it.age })
}