package io.leanlabs.functions

fun hello(): Unit {
    println("hello")
}

fun returnAFour(): Int {
    return 4
}

fun takingString(name: String) {
    println(name)
}

fun sum(x: Int, y: Int, z: Int = 0): Int {
    return x + y + z
}

fun printtDetails(name: String, email: String = "", phone: String): Unit {
    println("name - $name - email - $email - phone - $phone")
}

fun printStringOut(vararg strings: String) {
    reallyPrintStrings(*strings)
}

fun reallyPrintStrings(vararg strings: String) {
    for (str in strings) {
        println(str)
    }
}

fun main(args: Array<String>) {
    hello()

    val value = returnAFour()
    println(value)

    takingString("someValue")

    println(sum(1,2))
    println(sum(1,2, 3))
    printtDetails(phone = "3233232", name = "V", email = "aasdfasdf")

    printStringOut("string 1", "string 2", "string 3")
}