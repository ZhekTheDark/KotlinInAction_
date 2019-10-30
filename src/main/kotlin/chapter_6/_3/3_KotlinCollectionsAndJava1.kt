package chapter_6._3

fun printInUppercase(list: MutableList<String>) {
    println(CollectionUtils.uppercaseAll(list))
    println(list.first())
}

class CollectionUtils {
    companion object CollectionUtils {
        fun uppercaseAll(items: MutableList<String>): List<String> {
            for (i in items.indices) {
                items[i] = items[i].toUpperCase()
            }
            return items
        }
    }
}

fun main() {
    val list = mutableListOf("a", "b", "c")
    printInUppercase(list)
}