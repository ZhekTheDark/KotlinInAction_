package chapter_6._1

fun strLenSafe(s: String?): Int =
    if (s != null) s.length else 0

fun main(args: Array<String>) {
    val x: String? = null
    println(strLenSafe(x))
    println(strLenSafe("abc"))
}