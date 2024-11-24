package com.kotlinplayground.basics

fun main() {
    val range = 1..10

    for (i in range) println("i: $i")

    val reverseRange = 10 downTo 1
    for (i in reverseRange) println(i)

    for (i in reverseRange step 2) println("every second step: $i")

    fun exploreWhile() {
        var x = 1
        while (x < 5) {
            println("Value of x: $x")
            x++
        }
    }
    exploreWhile()

    exploreDoWhile()
}

fun exploreDoWhile() {
    var i = 0
    do{
        println("Value of I: $i")
        i++
    } while (i < 5)
}

