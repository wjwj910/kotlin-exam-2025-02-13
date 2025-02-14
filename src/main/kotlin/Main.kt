package org.example

class Person(val name: String, val age: Int) {
    fun getInfo() = "$name is $age years old."
}

fun main() {
    val person = Person("Alice", 30)

    val info = with(person) {
        getInfo()
    }

    println(info)
}