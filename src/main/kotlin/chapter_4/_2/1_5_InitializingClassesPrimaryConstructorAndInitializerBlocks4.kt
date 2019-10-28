package chapter_4._2

class User4(
    val nickname: String,
    val isSubscribed: Boolean = true)

fun main() {
    val alice = User4("Alice")
    println(alice.isSubscribed)

    val bob = User4("Bob", false)
    println(bob.isSubscribed)

    val carol = User4("Carol", isSubscribed = false)
    println(carol.isSubscribed)
}