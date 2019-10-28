package chapter_4._3

data class Client2(val name: String, val postalCode: Int)

fun main(args: Array<String>) {
    val bob = Client2("Bob", 973293)
    println(bob.copy(postalCode = 382555))
}