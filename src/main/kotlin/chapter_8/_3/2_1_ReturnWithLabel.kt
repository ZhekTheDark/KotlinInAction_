package chapter_8._3

fun lookForAliceLabel(people: List<Person>) {
    people.forEach label@{
        if (it.name == "Alice") return@label
    }
    println("Alice might be somewhere")
}

fun main() {
    lookForAliceLabel(people)
}