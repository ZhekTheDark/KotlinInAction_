package chapter_5._1

val sum = { x: Int, y: Int ->
    println("Computin the sum of $x and $y...")
    x + y
}

fun main() {
    println(sum(1, 2))
}