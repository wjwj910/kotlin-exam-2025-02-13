package org.example

fun main() {
    val number = 10 // 불변 변수 선언 (val)
    var message = "Hello, Kotlin!" // 문자열 변수 선언

    println("Number: $number")
    println("Message: $message")

    val num = 15

    val result = if (num % 2 == 0) "Even Number" else "Odd Number"
    println(result)

    for (i in 0 until 5) { // 0부터 4까지 반복
        println("Count: $i")
    }
}