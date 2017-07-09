package io.leanlabs.inheritance

// interface could NOT have state, only behavior
interface CustomerRepository {
    val isEmpty: Boolean
        get() = true

    // interfaces could have implementation
    fun store(obj: Customer) {
    }

    fun getById(id: Int): Customer
}

class SQLCustomerRepository : CustomerRepository {
    override fun store(obj: Customer) {
        super.store(obj)
    }

    override fun getById(id: Int): Customer {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

}

interface Interface1 {
    fun a() {
        println("from interface1")
    }
}

interface Interface2 {
    fun a() {
        println("from interface2")
    }
}

class Class1And2: Interface1, Interface2 {
    // in case of multiple inheritance we could point what parent we need
    override fun a() {
        super<Interface2>.a()
    }
}

fun main(args: Array<String>) {
    val c = Class1And2()
    c.a()
}