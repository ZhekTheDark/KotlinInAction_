package chapter_8._1

val averageMobileDuration = log
    .filter { it.os in setOf(OS.IOS, OS.ANDROID) }
    .map(SiteVisit::duration)
    .average()

fun main() {
    println(averageMobileDuration)
}