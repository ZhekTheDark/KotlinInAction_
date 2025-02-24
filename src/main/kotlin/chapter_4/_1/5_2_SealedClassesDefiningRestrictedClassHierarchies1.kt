package chapter_4._1

sealed class Expr1 {
    class Num(val value: Int) : Expr1()
    class Sum(val left: Expr, val right: Expr) : Expr1()
}

fun eval(e: Expr1): Int =
    when (e) {
        is Expr1.Num -> e.value
        is Expr1.Sum -> eval(e.right) + eval(e.left)
    }