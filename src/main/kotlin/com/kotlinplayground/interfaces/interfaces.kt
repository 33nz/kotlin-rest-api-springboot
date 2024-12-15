package com.kotlinplayground.interfaces

import com.kotlinplayground.classes.Course

interface CourseRepository {

    val isCoursePersisted: Boolean
    fun getById(id: Int): Course

    fun save(course: Course): Int {
        println("Course : $course")
        return course.id

    }
}

class SqlCourseRepository: CourseRepository {
    override var isCoursePersisted: Boolean = false

    override fun getById(id: Int): Course {
        return Course(id,
            "Reactive Programming in Modern Java", "Jacob Wingate")
    }

    override fun save(course: Course): Int {
        isCoursePersisted = true
        return super.save(course)
    }

}


interface A {

    fun doSomething() {
        println("doSomething in A")
    }
}

interface B {

    fun doSomething() {
        println("doSomething in B")
    }
}

class AB: A, B {
    override fun doSomething() {
        super<A>.doSomething()
        super<B>.doSomething()
        println("Do something AB")
    }
}

fun main() {

    val sqlCourseRepository = SqlCourseRepository()
    val course = sqlCourseRepository.getById(1)
    println("Course is: $course")

      val courseId = sqlCourseRepository.save(Course(5,
        "Reactive Programming in Modern Java", "Jacob Wingate"))
    println("Saved course id: $courseId")

    val ab = AB()
    ab.doSomething()

    println("Course persisted value is ${sqlCourseRepository.isCoursePersisted}")

}