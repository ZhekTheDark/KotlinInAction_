package chapter_4._2

interface User6 {
    val email: String
    val nickname: String
        get() = email.substringBefore('@')
}