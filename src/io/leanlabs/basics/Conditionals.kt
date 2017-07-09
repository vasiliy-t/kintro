package io.leanlabs.basics

fun main(args: Array<String>) {
    val myString = "null"

    // if IS an expression, returns the very last value of it
    val result = if (myString != "") {
        "not empty"
    } else if (myString.startsWith("a")) {
        "start with a"
    } else {
        "empty"
    }

    val whenValue = when (result) {
        is String -> "really not empty"
        "not empty" -> "this is really not empty"
        else -> "unpredictable"
    }
    println(whenValue)
}