package chapter_2._3

import chapter_2._3.Color.*

fun getWarmth1(color: Color) = when(color){
    RED, ORANGE, YELLOW -> "теплый"
    GREEN -> "нейтральный"
    BLUE, INDIGO, VIOLET -> "холодный"
}

fun main(args: Array<String>) {
    println(getWarmth1(Color.ORANGE))
}