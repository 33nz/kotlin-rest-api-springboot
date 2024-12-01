package com.kotlinplayground.classes

class Item {

    var name: String = ""
    var price: Double = 0.0
        get() {
            println("Inside Getter")
            return field
        }
        set(value) {
            if(value >= 0.0) {
                println("Inside Setter")
                field = value
            } else {
                throw IllegalArgumentException("Negative Price is not Allowed!")
            }
        }


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
    item.price = 12.33
    println(item.price)
}