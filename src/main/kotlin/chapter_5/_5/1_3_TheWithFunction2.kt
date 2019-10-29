package chapter_5._5

fun alphabet2() = with(StringBuilder()) {
    for (letter in 'A'..'Z') {
        append(letter)
    }
    append("\nNow I know the alphabet")
    toString()
}

fun main() {
    println(alphabet2())
}