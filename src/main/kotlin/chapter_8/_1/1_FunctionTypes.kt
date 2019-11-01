package chapter_8._1

fun performRequest(
    url: String,
    callback: (code: Int, content: String) -> Unit
) {
    /*...*/
}

fun main() {
    val url = "http://kotl.in"
    performRequest(url) {code, content -> /*...*/}
    performRequest(url) {code, page -> /*...*/}
}