package chapter_8._2

import java.io.BufferedReader
import java.io.FileReader

fun readFirstLineFile(path: String): String {
    BufferedReader(FileReader(path)).use { br ->
        return br.readLine()
    }
}