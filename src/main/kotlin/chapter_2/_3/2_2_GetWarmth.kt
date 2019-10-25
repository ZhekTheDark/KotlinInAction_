package chapter_2._3

fun getWarmth(color: Color) = when(color){
    Color.RED, Color.ORANGE, Color.YELLOW -> "теплый"
    Color.GREEN -> "нейтральный"
    Color.BLUE, Color.INDIGO, Color.VIOLET -> "холодный"
}

fun main(args: Array<String>) {
    println(getWarmth(Color.ORANGE))
}