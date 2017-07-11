package io.leanlabs.tidbits

class NotANumberException(s: String) : Throwable(s) {}

fun checkIsNumber(obj: Any) {
    when (obj) {
        !is Int, Float, Long, Double -> throw NotANumberException("not a number")
    }
}

fun main(args: Array<String>) {
    // try-catch is also an expression
    try {
        checkIsNumber("A")
    } catch (e: NotANumberException) {
        println("${e.message}")
    } finally {
        println("finally block")
    }

}