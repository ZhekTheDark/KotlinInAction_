package chapter_5._2

fun main() {
    val list = listOf("a", "ab", "b")
    println(list.groupBy(String::first))
    println(list.groupBy { s: String -> s.first() })
    println(list.groupBy { it.first() })
}