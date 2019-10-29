package chapter_5._2

fun main() {
    val people = listOf(Person("Alice", 29), Person("Bob", 31))
    println(people.map { it.name })

    println(people.filter { it.age >= 30 }.map { it.name })

    println(people.filter { it.age == people.maxBy{ it.age }!!.age })

//    val maxAge = people.maxBy(Person::age)!!.age
    val maxAge = people.maxBy { it.age }!!.age
    println(people.filter { it.age == maxAge })
}