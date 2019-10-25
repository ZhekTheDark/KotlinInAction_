package chapter_2._3

interface Expr
class Num(val value: Int): Expr
class Sum(val left: Expr, val right: Expr): Expr
class Minus(val left: Expr, val right: Expr): Expr
class Division(val left: Expr, val right: Expr): Expr
class Multiplication(val left: Expr, val right: Expr): Expr

fun eval(e: Expr): Int {
    if (e is Num) {
        val n = e as Num
        return n.value
    }
    if (e is Sum) {
        return eval(e.left) + eval(e.right)
    }
    throw IllegalArgumentException("Unknown expression")
}

fun main(args: Array<String>) {
    println(eval(Sum(Sum(Num(1), Num(2)), Num(4))))
}