package org.example

fun main() {
    print("Enter The Radius:")
    var r:Float= readln().toFloat()

    print("Enter The Height:")
    var h:Float= readln().toFloat()

    var volume=3.14*r*r*h

    println("The Volume of Cylinder->$volume")
}