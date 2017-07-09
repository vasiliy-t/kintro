package io.leanlabs.basics

// there are two ways variables could be defined: with var or with val
fun main(args: Array<String>) {
    // var is mutable, could be reassigned
    var streetNumber: Int = 10
    // variable types could be inferred
    var streetName = "High Street"

    // val is immutable, could NOT be reassigned
    val zip = "E11 P1"
}