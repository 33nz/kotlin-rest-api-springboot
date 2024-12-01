package com.kotlinplayground.classes

data class Employee(val id: Int, val name: String) {
}

fun main() {

    val employee1 = Employee(1, "Harry")
    println(employee1)


    val employee2 = employee1.copy()
    println("Compare employee1 & employee2 : ${employee1 == employee2}")


    val employee3 = employee1.copy(2, "Sam")
    println("Compare employee1 & employee3 : ${employee1 == employee3}")
}