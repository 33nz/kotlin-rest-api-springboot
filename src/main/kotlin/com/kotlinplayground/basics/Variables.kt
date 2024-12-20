package com.kotlinplayground.basics

import com.kotlinplayground.functions.courseName
import com.kotlinplayground.functions.topLevelFunction

fun main() {
     val name = "Jake"
    println(name)

    //name = "Jacob"

    var age = 41
    println(age)
    age = 42
    println(age)

    val salary = 3000L
    println(salary)

    val course = "Kotlin Spring"
    println("course: $course and the course length is ${course.length}")

    val multiLine = "ABC \nDEF"
    println(multiLine)

    val multiLine1 = """
        |ABC
        |DEF
    """.trimMargin()
    println(multiLine1)

    val num = topLevelFunction()
    println("Num is : $num")

    println("Course name : $courseName")
}