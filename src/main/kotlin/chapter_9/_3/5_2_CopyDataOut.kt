package chapter_9._3

fun <T> copyDataOut(source: MutableList<out T>,
                  destination: MutableList<T>) {
    for (item in source) {
        destination.add(item)
    }
}

fun main() {
    val ints = mutableListOf(1, 2, 3)
    val anyItems = mutableListOf<Any>()
    copyDataOut(ints, anyItems)
    println(anyItems)
}