package chapter_7._3

import java.time.LocalDate

fun main() {
    val now = LocalDate.now()
    val vacation = now..now.plusDays(10)
    println(now.plusWeeks(1) in vacation)
    println(vacation)

    val n = 9
    println(0..(n + 1))

    (0..n).forEach { print("$it ") }
}