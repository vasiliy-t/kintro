package io.leanlabs.io.leanlabs.classes

enum class Priority(val value: Int) {
    MINOR(-1),
    NORMAL(0) {
        override fun toString(): String {
            return "Normal priority"
        }
    },
    MAJOR(1),
    CRITICAL(10)
}

fun main(args: Array<String>) {
    val priority = Priority.NORMAL

    println(priority)
    println(priority.value)

    for (p in Priority.values()) {
        println(p.value)
    }

    println(Priority.valueOf("MAJOR").ordinal)
}