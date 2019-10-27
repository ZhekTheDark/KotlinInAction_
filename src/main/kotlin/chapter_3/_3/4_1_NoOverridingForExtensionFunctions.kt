package chapter_3._3

open class View {
    open fun click() = println("Button clicked")
}

class Button: View() {
    override fun click() = println("Button clicked")
}

fun main() {
    val view: View = Button()
    view.click()
}