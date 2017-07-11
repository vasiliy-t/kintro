package io.leanlabs.functional

fun operation1(x: Int, y: Int, op: (Int, Int) -> Int): Int {
    return op(x, y)
}

fun unaryOperation(x: Int, op: (Int) -> Int): Int {
    return op(x)
}

fun main(args: Array<String>) {
    val sum: (Int, Int) -> Int = { x, y -> x + y }
    println(operation1(1,2, sum))

    println(unaryOperation(2) { x -> x * x })
    println(unaryOperation(3) { it * it })

    println(operation1(4,2, fun (x: Int, y: Int): Int = x + y))
}