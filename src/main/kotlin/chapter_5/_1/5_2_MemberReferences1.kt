package chapter_5._1

fun main() {
    val createPerson = ::Person
    val p = createPerson("Alice", 29)
    println(p)

    fun Person.isAdult() = age >= 21
    val predicate = Person::isAdult
    println(p.isAdult())
}