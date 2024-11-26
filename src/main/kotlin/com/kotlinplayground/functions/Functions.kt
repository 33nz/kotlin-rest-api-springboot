package com.kotlinplayground.functions

import java.time.LocalDate

fun printName(name: String) {
    println("Name is $name")
}

fun addition(x: Int, y: Int): Int {
    return x + y
}

fun jApproach1(x: Int, y: Int) = x + y

fun printPersonDetails(name: String, email: String = "undefined", dob: LocalDate = LocalDate.now()) {

    println("Name is $name, email is $email, and DOB is $dob.")

}

fun subtraction(x: Int, y: Int): Int {
    return x - y
}


fun main() {

    printName("Jake")

    val result = addition(1, 2)
    println("Result is $result")

    val result1 = jApproach1(1, 2)
    println("Result1 is $result")

    printPersonDetails("Jacob", "jacobwinagte33@gmail.com", LocalDate.parse("1903-08-13"))

    printPersonDetails("Jacob")

    val subtractionResult = subtraction(33, 11)
    println(subtractionResult)
}

