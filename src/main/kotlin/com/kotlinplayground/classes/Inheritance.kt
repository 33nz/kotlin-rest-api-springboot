package com.kotlinplayground.classes

open class User(val name: String) {
    open var isLoggedIn: Boolean = false
    open fun login(){
        println("Inside user login")
    }
    private fun secret() {
        println("Secret: Inside your Login")
    }
   open protected fun logout() {
        println("Logout: Inside your Login")
    }
}

class Student(name: String) : User(name) {
    override var isLoggedIn: Boolean = false

    companion object {
        const val noOfEnrolledCourses = 10
        fun country() = "USA"
    }

    override fun login() {
        println("Inside student login")
        super.login()
    }

    override fun logout() {
        super.logout()
        println("Inside Student logout")
    }


}


class Instructor(name: String) : User(name)

fun main() {

    val student = Student("Jake")
    println("Student name: ${student.name}")
    student.login()
    student.isLoggedIn = true
    println("Logged in value: ${student.isLoggedIn}")

    val country = Student.country()
    println("Country is: $country")

    println("noOfEnrolledCourses: ${Student.noOfEnrolledCourses}")

    val instructor = Instructor("Ms. Palamountain")
    println("Teacher name: ${instructor.name}")
    instructor.login()

    val user = User("August")

}