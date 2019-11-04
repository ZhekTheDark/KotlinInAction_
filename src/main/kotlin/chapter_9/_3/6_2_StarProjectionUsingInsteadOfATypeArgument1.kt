package chapter_9._3

fun <T> printFirstT(list: List<T>) {
    if (list.isNotEmpty()) {
        println(list.first())
    }
}

fun main() {
    printFirstT(listOf("Svetlana", "Dmitry"))
}