package io.leanlabs.inheritance

// class is "final" by default so it could not be inherited
// to do it inheritable it should be declared as "open"
open class Person() {
    // member functions is "final" by default too, could not be overridden
    // "open" makes it overriddable
    open fun validate() {
    }

    open fun stringify() {}
}

class Customer: Person {
    override fun validate() {
    }

    final override fun stringify() {
        super.stringify()
    }

    constructor(): super() {
    }
}

fun main(args: Array<String>) {
    val customer = Customer()
    customer.validate()
}