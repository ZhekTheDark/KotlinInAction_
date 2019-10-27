package chapter_3._3

val String.lastChar: Char
    get() = get(length - 1)

var StringBuilder.lastChar: Char
    get() = get(length - 1)
    set(value: Char) {
        this.setCharAt(length - 1, value)
    }
fun main() {
    println("Kotlin".lastChar)
    val sb = java.lang.StringBuilder("Kotlin?")
    sb.lastChar = '!'
    println(sb)
}