package chapter_6._1

fun strLenSafe1(s: String?): Int = s?.length ?: 0

fun main() {
    println(strLenSafe1("abc"))
    println(strLenSafe1(null))
}