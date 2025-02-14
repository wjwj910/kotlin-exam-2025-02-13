package org.example

fun main() {
    var name: String? = "HI"
    name = "Hello"
    // ? 붙히면 Strin 일수도 있고 null 일수도 있다.
    name = null
    
    // String 이 있으면(null -> x) length 를 실행하고,
    // 없으면 Name is null(null -> o) 을 실행하라
    println(name?.length ?: "Name is null")
    
}