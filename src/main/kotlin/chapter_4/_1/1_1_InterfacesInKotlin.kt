package chapter_4._1

interface Clickable {
    fun click()
    fun showOff() = println("I'm clickable")
}

class Button : Clickable {
    override fun click() = println("I was clicker")
}

fun main() {
    Button().click()
    Button().showOff()
}