package chapter_8._3

fun lookForAliceAnonymous(people: List<Person>) {
    people.forEach(fun (person) {
        if (person.name == "Alice") return
        println("${person.name} is not Alice")
    })
}

fun main() {
    lookForAliceAnonymous(people)
}