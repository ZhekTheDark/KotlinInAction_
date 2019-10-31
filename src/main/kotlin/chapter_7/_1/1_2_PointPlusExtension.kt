package chapter_7._1

data class Point1(val x: Int, val y: Int)

operator fun Point1.plus(other: Point1): Point1 {
    return Point1(x + other.x, y + other.y)
}

fun main() {
    val p1 = Point1(10, 20)
    val p2 = Point1(30, 40)
    println(p1 + p2)
}