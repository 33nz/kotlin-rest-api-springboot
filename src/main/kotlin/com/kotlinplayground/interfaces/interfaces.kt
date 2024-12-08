package com.kotlinplayground.interfaces

import com.kotlinplayground.classes.Course

interface CourseRepository {

    fun getById(id: Int): Course

    fun save(course: Course): Int {
        println("Course : $course")
        return course.id

    }
}

class SqlCourseRepository: CourseRepository {
    override fun getById(id: Int): Course {
        return Course(id,
            "Reactive Programming in Modern Java", "Jacob Wingate")
    }

}

fun main() {

    val sqlCourseRepository = SqlCourseRepository()
    val course = sqlCourseRepository.getById(1)
    println("Course is: $course")

    val courseId = sqlCourseRepository.save(Course(5,
        "Reactive Programming in Modern Java", "Jacob Wingate"))
    println("Saved course id: $courseId")

}