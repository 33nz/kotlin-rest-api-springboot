package com.kotlinplayground.classes

open class User(val name: String) {
    open var isLoggedIn: Boolean = false
    open fun login(){
        println("Inside user login")
    }

}

class Student(name: String) : User(name) {
    override var isLoggedIn: Boolean = false
    override fun login() {
        println("Inside student login")
        super.login()
    }
}


class Instructor(name: String) : User(name)

fun main() {

    val student = Student("Jake")
    println("Student name: ${student.name}")
    student.login()
    student.isLoggedIn = true
    println("Logged in value: ${student.isLoggedIn}")

    val instructor = Instructor("Ms. Palamountain")
    println("Teacher name: ${instructor.name}")
    instructor.login()
}