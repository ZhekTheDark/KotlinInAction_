package chapter_8._2

fun main() {
    println(people.filter { it.age > 30 }
        .map(Person::name))
}