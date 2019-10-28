package chapter_4._2

class LengthCounter {
    var counter: Int = 0
        private set

    fun addWord(word: String) {
        counter += word.length
    }
}

fun main() {
    val lenghtCounter = LengthCounter()
    lenghtCounter.addWord("Hi!")
    println(lenghtCounter.counter)

    lenghtCounter.addWord("Kotlin!")
    println(lenghtCounter.counter)
}