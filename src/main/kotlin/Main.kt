package org.example

fun main() {
    val names = listOf("Alice", "Bob", "Charlie")

    val greetings = names.map { "Hello, $it" }

    greetings.forEach(::println)
}