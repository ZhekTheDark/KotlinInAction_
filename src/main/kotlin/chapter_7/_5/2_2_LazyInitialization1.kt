package chapter_7._5

fun loadEmails1(person: Person1): List<Email> {
    println("Load emails for ${person.name}")
    return listOf(/*...*/)
}

class Person1(val name: String) {
    val emails by lazy { loadEmails1(this) }
}