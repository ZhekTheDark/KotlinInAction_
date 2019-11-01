package chapter_8._3

fun lookForAliceForEach(people: List<Person>) {
    people.forEach {
        if (it.name == "Alice") {
            println("Found!")
            return
        }
    }

    println("Alice is not found")
}

fun main() {
    lookForAlice(people)
}