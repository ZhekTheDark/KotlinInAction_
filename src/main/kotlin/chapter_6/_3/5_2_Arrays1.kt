package chapter_6._3

fun main() {
    val letters = Array<String>(26) {i -> ('a' + i).toString()}
    println(letters.joinToString(""))
}