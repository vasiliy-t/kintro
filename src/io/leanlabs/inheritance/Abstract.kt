package io.leanlabs.inheritance

abstract class StoredEntity {
    val isActive = true

    abstract fun store()

    // abstract class could have non abstract implemented methods
    fun status(): String {
        return isActive.toString()
    }
}

class Employee: StoredEntity() {
    // abstract member funs must be implemented
    override fun store() {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

}

fun main(args: Array<String>) {
    val e = Employee()
    println(e.status())
}