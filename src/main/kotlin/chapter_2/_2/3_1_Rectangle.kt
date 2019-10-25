package geometry.shapes

import chapter_2._2.Rectangle
import java.util.Random

fun createRandomRectangle(): Rectangle {
    val random = Random()
    return Rectangle(random.nextInt(), random.nextInt())
}