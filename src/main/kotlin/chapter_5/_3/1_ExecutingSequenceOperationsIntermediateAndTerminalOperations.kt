package chapter_5._3

fun main() {
    listOf(1, 2, 3, 4).asSequence()
        .map { print("map($it) "); it*it }
        .filter { print("filter($it) "); it % 2 == 0 }
        .toList()
    println()
    println(listOf(1, 2, 3, 4).asSequence()
        .map { it * it }
        .find { it > 3 })
}