package chapter_2._4

import java.util.*

fun main() {
    val binaryReps = TreeMap<Char, String>()

    for (c in 'A'..'F') {
        val binary = Integer.toBinaryString(c.toInt())
        binaryReps[c] = binary
    }

    for ((letter, binary) in binaryReps) {
        println("$letter = $binary")
    }

    println()
    val list = arrayListOf("10", "11", "1001")

    for ((index, element) in list.withIndex()) {
        println("$index: $element")
    }
}