package chapter_2._3

enum class Color1 {
    RED, ORANGE, YELLOW, GREEN, BLUE, INDIGO, VIOLET
}

fun getMnemonic(color: Color) = when (color) {
    Color.RED -> "Каждый"
    Color.ORANGE -> "Охотник"
    Color.YELLOW -> "Желает"
    Color.GREEN -> "Знать"
    Color.BLUE -> "Где"
    Color.INDIGO -> "Сидит"
    Color.VIOLET -> "Фазан"
}

fun main(args: Array<String>) {
    println(getMnemonic(Color.BLUE))
}