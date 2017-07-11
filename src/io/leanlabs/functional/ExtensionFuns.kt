package io.leanlabs.functional

fun String.hello(s: String) {
    println("extension fun from String")
}

fun String.toTitleCase(): String {
    return this.split(" ").joinToString(" ") { it.capitalize() }
}

class Customer {
    fun makePreferred() {
        println("method from class")
    }
}

fun Customer.makePreferred() {
    println("extension function")
}

fun main(args: Array<String>) {
    println("hello, world".toTitleCase())

    val c = Customer()
    c.makePreferred()
}