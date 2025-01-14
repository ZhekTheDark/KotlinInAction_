package chapter_5._3

fun main() {
    val naturalNumbers = generateSequence(0) {it + 1}
    val numbersTo100 = naturalNumbers.takeWhile { it <= 100 }
    println(numbersTo100.sum())
}