package org.example

fun main() {
    print("Enter The Value of X:-")
    var x:Float= readln().toFloat()
    print("Enter The Value of Y:-")
    var y:Float= readln().toFloat()

    var exp=((2*x)+(3*y))/(x*y)

    println("The Expression (2X+3Y)/XY  -> $exp")
}