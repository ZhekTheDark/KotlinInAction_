package chapter_3._3

fun String.lastChar(): Char = this.get(this.length - 1)

fun main() {
    println("Kotlin".lastChar())
}