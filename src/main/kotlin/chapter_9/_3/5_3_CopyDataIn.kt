package chapter_9._3

fun <T> copyDataIn(source: MutableList<T>,
                    destination: MutableList<in T>) {
    for (item in source) {
        destination.add(item)
    }
}

fun main() {
    val ints = mutableListOf(1, 2, 3)
    val anyItems = mutableListOf<Any>()
    copyDataIn(ints, anyItems)
    println(anyItems)
}