package io.leanlabs.tidbits

val CopyrightAuthor = "v"
// there is no constants in kotlin
object Copyright {
    val author = "v"
}

fun main(args: Array<String>) {
    Copyright.author
    CopyrightAuthor
}