package chapter_7._1

operator fun Point.times(scale: Double) : Point {
    return Point((x * scale).toInt(), (y * scale).toInt())
}

fun main() {
    var p = Point(10, 20)
    println(p * 1.5)
}