package com.kotlinplayground.classes

object Authenticate {

    fun authenticate(userName: String, password: String){
        println("User authenticate for userName: $userName")
    }
}

fun main() {
    Authenticate.authenticate("Jake", "guessmypassword134")

    Authenticate.authenticate("Verena", "thisismypassword")
}