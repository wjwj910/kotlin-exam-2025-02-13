package org.example

class Example {
    lateinit var name: String
    val lazyMessage: String by lazy {
        println("Lazy value initialized!")
        "Hello, Lazy!"
    }
}

fun main() {
    val example = Example()

    // lateinit 사용: 명시적으로 값 할당 후 사용
    example.name = "Alice"
    println("Name: ${example.name}")

    // lazy 사용: 최초 접근 시 초기화
    println("Before accessing lazyMessage")
    println(example.lazyMessage)
    println(example.lazyMessage) // 두 번째 호출은 초기화 없이 사용
}