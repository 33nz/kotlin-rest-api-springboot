package com.kotlinplayground.classes

class Item {

    var name : String = ""

    constructor(_name: String) : this() {
        name = _name
    }

    constructor()
}

fun main() {

    val item = Item("Iphone")
    println("Items name is ${item.name}")

    item.name = "Iphone 12"
    println("Item is ${item.name}")

    println(item)
}