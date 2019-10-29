package chapter_5._1

fun salute() = println("Salute!")

fun sendEmail(person: Person, message: String) {
    println("""
        "$message" was send to $person
    """.trimIndent())
}

fun main() {
    run(::salute)

    val action = { person: Person, message: String ->
        sendEmail(person, message)
    }
    val nextAction = ::sendEmail
}