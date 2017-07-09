package io.leanlabs.io.leanlabs.classes

import java.util.*

class Customer {
    // property declaration
    var id = 0
    // properties MUST be initialized or MUST be "abstract"
    var name: String = ""

    // kotlin doesn't have concept of "fields" only properties
    // what the heck is "field" then in jvm?
}

class CustomerV1(var id: Int = 0, var name: String = "", val surname: String = "") {
    // initialization
    init {
        name = name.toUpperCase()
    }

    // secondary constuctors delegates construction to primary
    constructor(email: String) : this(0, "") {
        name = name.toUpperCase()
    }

}

class CustomerV3(var id: Int, var name: String, val yearOfBirth: Int) {
    // default visibility level is "public"
    val age: Int
        get() = Calendar.getInstance().get(Calendar.YEAR) - yearOfBirth

    var socialSecurityNumber: String = ""
        set(value) {
            field = value
        }

    fun customerAsString(): String {
        return "id: $id, name: $name, age: $age, sn: $socialSecurityNumber"
    }
}

data class CustomerV4(var id: Int, var name: String, var email: String)

fun main(args: Array<String>) {
    val customer = Customer()

    customer.id = 10
    customer.name = "V"

    println(customer)

    val customerv1 = CustomerV1(id = 10, name = "v", surname = "doesn't matter")
    CustomerV1(email = "v.tyubek@gmail.com")

    println("id: ${customerv1.id}, name: ${customerv1.name}, surname: ${customerv1.surname}")

    val customerv3 = CustomerV3(10, "V", 1988)
    customerv3.socialSecurityNumber = "SN12345"
    println(customerv3.customerAsString())

    val customerV4 = CustomerV4(10, "V", "blahblah@mail.com")
    println(customerV4)

    val oneMoreCustomerV4 = CustomerV4(10, "V", "blahblah@mail.com")
    if (customerV4 == oneMoreCustomerV4) {
        println("$customerV4 is equal to $oneMoreCustomerV4")
    }

    val anotherOneCustomerV4 = CustomerV4(11, "V", "blahblah@mail.com")
    if (customerV4 == anotherOneCustomerV4) {
        println("$customerV4 is equal to $anotherOneCustomerV4")
    } else {
        println("$customerV4 is NOT equl to $anotherOneCustomerV4")
    }
}
