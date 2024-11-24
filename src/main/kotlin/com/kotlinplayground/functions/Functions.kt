package com.kotlinplayground.functions

fun printName(name: String) {
    println("Name is $name")
}

fun addition(x: Int, y: Int): Int {
    return x + y
}

fun jApproach1(x: Int, y: Int) = x + y


fun main() {

    printName("Jake")

    val result = addition(1, 2)
    println("Result is $result")

    val result1 = jApproach1(1, 2)
    println("Result1 is $result")
}

