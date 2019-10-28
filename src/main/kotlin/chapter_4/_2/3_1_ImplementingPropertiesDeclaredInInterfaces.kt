package chapter_4._2

fun getFacebookName(accountId: Int) = "fb:$accountId"

interface User5 {
    val nickname: String
}

class PrivateUser(override val nickname: String) : User5

class SubscribingUser(val email: String) : User5 {
    override val nickname: String
        get() = email.substringBefore('@')
}

class FacebookUser(val accountId: Int) : User5 {
    override val nickname: String  = getFacebookName(accountId)
}

fun main() {
    println(PrivateUser("test@kotlinlang.org").nickname)
    println(SubscribingUser("test@kotlinlang.org").nickname)
}