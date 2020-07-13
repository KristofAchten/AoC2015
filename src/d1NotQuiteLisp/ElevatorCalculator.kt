package d1NotQuiteLisp

import readInput
import java.lang.IllegalArgumentException

const val PATH = "src/d1NotQuiteLisp/input.txt"

fun whatFloor(): Int {
    val input = readInput(PATH)
    var floor = 0

    input.forEach {
        floor += parseFloor(it)
    }

    return floor
}

fun basementIndex(): Int {
    val input = readInput(PATH)
    var floor = 0
    for (i in input.indices) {
        if (floor < 0) {
            return i
        }
        floor += parseFloor(input[i])
    }
    throw IllegalArgumentException("Parsed input never goes below 0")
}

fun parseFloor(c: Char): Int {
    return when(c) {
        '(' -> 1
        ')' -> -1
        else -> 0
    }
}
