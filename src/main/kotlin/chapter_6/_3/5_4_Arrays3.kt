package chapter_6._3

fun main() {
    val squares = IntArray(5) {i -> (i+1) * (i+1)}
    println(squares.joinToString())
}