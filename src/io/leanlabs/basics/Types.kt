package io.leanlabs.basics

fun main(args: Array<String>) {
    // numbers
    val myLong = 10L
    val myFloat = 100F
    val myHex = 0x0F
    val myBinary = 0xb01

    val myInt = 100

    // there are no implicit type conversion, everything must be converted explicitly
    val myLongAgain: Long = myInt.toLong()


    // strings
    val myChar = 'A'
    val myString = "My string"

    val escapeCharacters = "A new line \n"

    val multilineString = "Hello" +
            "Second line" +
            "Third line"

    val rawString = """
            This is a string
            this is another line
            """

    // interpolation
    val years = 10
    val decade = "A decade is $years years"

    // method could be called on interpolated variables
    val name = "name"
    val anotherMessage = "Length of name is ${name.length}"
}