package chapter_4._1

class Outer {
    inner class Inner {
        fun getOuterReference(): Outer = this@Outer
    }
}