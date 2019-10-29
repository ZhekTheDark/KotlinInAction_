package chapter_5._2

fun main() {
    val list = listOf(1, 2, 3)
    println(!list.all { it == 3 })
    println(list.any { it != 3 })
}