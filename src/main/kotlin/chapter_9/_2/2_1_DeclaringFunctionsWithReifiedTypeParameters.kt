package chapter_9._2

inline fun <reified T> isA(value: Any) = value is T

fun main() {
    println(isA<String>("abc"))
    println(isA<String>(123))
}