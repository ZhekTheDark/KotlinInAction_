package chapter_4._3

class Client1(val name: String, val postalCode: Int) {
    override fun equals(other: Any?): Boolean {
        if (other == null || other !is Client1)
            return false
        return name == other.name &&
                postalCode == other.postalCode
    }

    override fun toString(): String = "Client(name=$name, postalCode=$postalCode)"

    override fun hashCode(): Int = name.hashCode() * 31 + postalCode
}

fun main() {
    val processed = hashSetOf(Client1("Alice", 342562))
    println(processed.contains(Client1("Alice", 342562)))
}