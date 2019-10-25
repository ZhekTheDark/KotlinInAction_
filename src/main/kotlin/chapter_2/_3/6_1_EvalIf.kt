package chapter_2._3

fun eval1(e: Expr): Int =
    if (e is Num) {
        e.value
    } else if (e is Sum) {
        eval1(e.left) + eval1(e.right)
    } else {
        throw IllegalArgumentException("Unknown expression")
    }

fun main(args: Array<String>) {
    println(eval(Sum(Num(1), Num(2))))
}