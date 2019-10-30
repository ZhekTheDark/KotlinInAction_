package chapter_6._1

fun <T> printHashCode(t: T) {
    println(t?.hashCode())
}

fun <T: Any> printHashCode1(t: T) {
    println(t.hashCode())
}

fun main() {
    printHashCode(null)
//    printHashCode1(null)
    printHashCode1(42)
}