package io.leanlabs.basics

// kotlin allows multiple main functions per package
// what is the order of main functions execution?
fun main(args: Array<String>) {
    // does a is mutable?
    for (a in 1..100) {
        println(a)
    }

    val numbers = 1..100 // IntRange, NOT actual List<Int>

    for (a in numbers) {
        println(a)
    }

    for (b in 100 downTo 1) {
        println(b)
    }

    for (b in 100 downTo 1 step 5) {
        println(b)
    }

    val capitals = listOf("Moscow", "Paris", "NewYork", "Tokyo")
    for (c in capitals) {
        println(c)
    }

    //goto labels

    label@ for (i in 1..100) {
        for (j in 1..100) {
            if (j % i == 0) {
                println("$i ±$j")
                break@label
            }
        }
    }
}