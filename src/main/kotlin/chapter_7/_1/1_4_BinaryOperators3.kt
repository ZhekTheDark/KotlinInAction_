package chapter_7._1

operator fun Char.times(count: Int): String {
    return toString().repeat(count)
}

fun main() {
    println('a'*3)
}