package chapter_2._3

fun evalWithLogging(e: Expr): Int =
    when (e) {
        is Num -> {
            println("num: ${e.value}")
            e.value
        }
        is Sum -> {
            val left = evalWithLogging(e.left)
            val right = evalWithLogging(e.right)
            println("sum: $left + $right")
            left + right
        }
        is Minus -> {
            val left = evalWithLogging(e.left)
            val right = evalWithLogging(e.right)
            println("minus: $left - $right")
            left - right
        }
        is Division -> {
            val left = evalWithLogging(e.left)
            val right = evalWithLogging(e.right)
            println("division: $left / $right")
            left / right
        }
        is Multiplication -> {
            val left = evalWithLogging(e.left)
            val right = evalWithLogging(e.right)
            println("multiplication: $left * $right")
            left * right
        }
        else -> throw IllegalArgumentException("Unknown Expression")
    }

fun main(args: Array<String>) {
    println(
        evalWithLogging(
            Division(
                Multiplication(
                    Sum(
                        Sum(
                            Num(1), Num(2)
                        ), Num(4)
                    ),
                    Num(4)
                ),
                Num(2)
            )
        )
    )
}