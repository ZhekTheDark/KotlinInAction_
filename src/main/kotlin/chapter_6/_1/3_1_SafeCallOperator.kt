package chapter_6._1

fun printAllCaps(s: String?) {
    val allCaps: String? = s?.toUpperCase()
    println(allCaps)
}

fun main() {
    printAllCaps("abc")
    printAllCaps(null)
}