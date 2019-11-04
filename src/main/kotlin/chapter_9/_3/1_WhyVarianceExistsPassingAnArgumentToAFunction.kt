package chapter_9._3

fun printContents(list: List<Any>) {
    println(list.joinToString())
}

//fun addAnswer(list: MutableList<Any>){
//    list.add(42)
//}

fun main() {
    printContents(listOf("abc", "bac"))

//    val strings = mutableListOf("abc", "bac")
//    addAnswer(strings)
//    println(strings.maxBy { it.length })
}