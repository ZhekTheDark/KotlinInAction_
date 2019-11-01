package chapter_8._3

fun lookForAliceForEachLabel(people: List<Person>) {
    people.forEach {
        if (it.name == "Alice") return@forEach
    }
    println("Alice might be somewhere")
}

fun main() {
    lookForAliceForEachLabel(people)
}