package chapter_4._2

class User7(val name: String) {
    var address: String = "unspecified"
        set(value: String) {
            println("""
                Address was changed fo $name: 
                "$field" -> "$value".""".trimIndent())
            field = value
        }
}

fun main() {
    val user = User7("Alice")
    user.address = "Elsenheimerstrasse 47, 80687 Muenchen"
}