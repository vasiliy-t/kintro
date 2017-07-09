package io.leanlabs.io.leanlabs.classes

// object is a singletone
object Global {
    val PI = 3.14
}

fun main(args: Array<String>) {
    val localObject = object {
        val PI = 3.14159
    }

    println(Global.PI)
    println(localObject.PI)
}
