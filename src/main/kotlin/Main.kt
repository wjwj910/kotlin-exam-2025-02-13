package org.example

fun main() {
    val name: String? = null

    name?.let {
        println("Length: ${it.length}")
    }
}