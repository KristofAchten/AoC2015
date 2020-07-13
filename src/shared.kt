import java.io.BufferedReader
import java.io.File

fun readInput(path: String): String {
    val reader: BufferedReader = File(path).bufferedReader()
    return reader.use { it.readText() }
}