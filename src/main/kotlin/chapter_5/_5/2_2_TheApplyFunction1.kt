package chapter_5._5

fun alphabet4() = buildString {
    for (letter in 'A'..'Z') {
        append(letter)
    }
    append("\nNow I know the alphabet!")
}

fun main() {
    println(alphabet4())
}