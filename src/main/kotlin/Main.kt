package org.example

fun main() {
    val message = "Hello".also {
        println("Before: $it")
    }.uppercase().also {
        println("After: $it")
    }
}