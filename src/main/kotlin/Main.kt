package org.example

class Person {
    var name: String = ""
    var age: Int = 0
}

fun main() {
    val person = Person()

    person.apply { // 객체 자체 반환
        name = "Alice"
        age = 30
    }.also { // 객체 그대로 유지하면서 로깅 가능
        println("Created person: ${it.name}, ${it.age}")
    }.let { // 변환 가능 (여기서는 이름 길이 반환)
        it.name.length
    }.run { // 특정 연산 후 결과 반환
        this * 2
    }.also { println("Final result: $it") }

    val personInfo = with(person) { // 객체 컨텍스트로 실행 후 결과 반환
        "Name: $name, Age: $age"
    }

    println(personInfo)
}