package chapter_5._4

fun createAllDoneRunnable(): Runnable {
    return Runnable { println("All done!") }
}

fun main() {
    createAllDoneRunnable().run()
}