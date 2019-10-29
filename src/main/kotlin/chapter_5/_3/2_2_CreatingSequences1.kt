package chapter_5._3

import java.io.File

fun File.isInsideHiddenDirectory() = kotlin.sequences.generateSequence(this) { it.parentFile }.any { it.isHidden }

fun main() {
    val file = File("/Users/svtk/.HiddenDir/a.txt")
    println(file.isInsideHiddenDirectory())
}