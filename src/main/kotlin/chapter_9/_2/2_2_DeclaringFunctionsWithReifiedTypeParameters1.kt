package chapter_9._2

fun main() {
    val items = listOf("one", 2, "three")
    println(items.filterIsInstance<String>())
}