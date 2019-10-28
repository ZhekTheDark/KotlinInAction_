package chapter_4._3

class Client(val name: String, val postalCode: Int) {
    override fun toString(): String = "Client(name=$name, postalCode=$postalCode)"
}

fun main() {
    val client1 = Client("Alice", 342562)
    println(client1)
}