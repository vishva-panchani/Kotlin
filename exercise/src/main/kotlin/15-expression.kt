package org.example

fun main() {
    print("Enter The Value of X:-")
    var x:Float= readln().toFloat()
    print("Enter The Value of Y:-")
    var y:Float= readln().toFloat()

    var exp=((x+y)/(x-y))

    println("The Expression (x+y)/(x-y)->$exp")


}