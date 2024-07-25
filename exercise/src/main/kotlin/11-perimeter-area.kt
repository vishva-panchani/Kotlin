package org.example

fun main() {
    print("Enter The Length of Rectangle:")
    var l :Float= readln().toFloat()
    print("Enter The width of Rectangle:")
    val w :Float= readln().toFloat()

    var perimeter= 2*(l+w)
    var area=l*w

    println("The Perimeter of Rectangle->$perimeter")
    println("The Area of Rectangle->$area")
}