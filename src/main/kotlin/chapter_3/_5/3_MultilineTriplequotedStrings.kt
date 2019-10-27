package chapter_3._5

val kotlinLogo = """| //
|//
|/ \
"""

val kotlinLogoMargin = """| //
                         .|//
                         .|/ \
"""

fun main() {
    println(kotlinLogo)
    println(kotlinLogoMargin.trimMargin("."))
}