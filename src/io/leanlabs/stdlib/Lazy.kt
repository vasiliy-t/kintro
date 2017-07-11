package io.leanlabs.stdlib

fun main(args: Array<String>) {
    val numbers = 1..1000000000

    // by default computations are eager, until list converted to iterable
    // unlike java streams sequences are not parallellized
    numbers.asSequence().filter { it < 30 }.forEach { println(it) }
    val s = numbers.asSequence().take(30).sum()
    println(s)

    val generator = generateSequence(1) { x -> x * 10 }
    println(generator.take(10).sum())

    // only initialized when called
    val lazyInt: Int by lazy{ 10 }
}