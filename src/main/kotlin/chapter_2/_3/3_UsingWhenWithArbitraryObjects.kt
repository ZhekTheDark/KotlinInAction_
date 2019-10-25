package chapter_2._3

import chapter_2._3.Color.*
import java.lang.Exception

fun mix(c1: Color, c2: Color) = when(setOf(c1, c2)) {
    setOf(RED, YELLOW) -> ORANGE
    setOf(YELLOW, BLUE) -> GREEN
    setOf(BLUE, VIOLET) -> INDIGO
    else -> throw Exception("Грязный цвет")
}

fun main(args: Array<String>) {
    println(mix(BLUE, YELLOW))
}