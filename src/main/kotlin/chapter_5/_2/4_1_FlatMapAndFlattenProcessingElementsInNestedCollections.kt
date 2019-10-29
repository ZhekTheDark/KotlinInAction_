package chapter_5._2

class Book(val title: String, val authors: List<String>)

fun main() {
    val strings = listOf("abc", "def")
    println(strings.flatMap { it.toList() })
}