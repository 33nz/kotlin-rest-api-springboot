package com.kotlinplayground.basics

fun main() {
    //if-else
    //when

    var name = "Jacob"
    name = "Verena"
    val result = if(name.length == 5) {
        println("Name is 5 characters")
        name
    } else {
        println("Name is not 5 characters")
        name.length
    }

    println("Result: $result")

    // 1 -> Gold, 2 -> Silver, 3 -> Bronze

    var position = 4

    val medal = when (position) {
        1 -> "Gold"
        2 -> "Silver"
        3 -> "Bronze"
        else -> "No medal"
    }

    val medal2 = if (position == 1) {
        "Gold"
    } else if (position == 2) {
        "Silver"
    } else if (position == 3) {
        "Bronze"
    } else {
        "No medal"
    }
    println(medal)
}