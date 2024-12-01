package com.kotlinplayground.classes

open class User(val name: String) {

    fun login(){
        println("Inside user login")
    }

}

class Student(name: String) : User(name)

class Instructor(name: String) : User(name)

fun main() {

    val student = Student("Jake")
    println("Student name: ${student.name}")
    student.login()

    val instructor = Instructor("Ms. Palamountain")
    println("Teacher name: ${instructor.name}")
    instructor.login()
}