package org.example

fun main() {
    print("Enter The Value of X:-")
    var x:Float= readln().toFloat()
    print("Enter The Value of Y:-")
    var y:Float= readln().toFloat()
    var exp=(3*(x*x))+(2*x*y)+(3*(y*y))

    println("The Expression (3X2+2XY+3Y2)->$exp")
}