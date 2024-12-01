package com.kotlinplayground.classes

data class Course(
    val id: Int,
    val name: String,
    val author: String
)

fun main() {

    val course = Course(1, "Reactive Programming in Modern Java", "Jacob Wingate")

    val course1 = Course(1, "Reactive Programming in Modern Java", "Jacob Wingate")

    val course2 = Course(1, "Reactive Programming in Modern TypeScript", "Jacob Wingate")

//println(course)

    println("Checking Object Equality : ${course == course1}")
    println("Checking Object Equality : ${course == course2}")

    val course3 = course1.copy(

        id = 3, author = "Jake"

    )

    println(course3)
}

