package chapter_9._2

fun printSum(c: Collection<Int>) {
    if (c is List<Int>) {
        println(c.sum())
    }
}

fun main() {
    printSum(listOf(1, 2, 3))
}