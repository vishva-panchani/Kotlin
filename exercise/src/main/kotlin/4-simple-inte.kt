package org.example

fun main() {
    print("Enter Principal Amt:")
    var p:Float= readln().toFloat()

    print("Enter Rate of Interest:")
    var r:Float= readln().toFloat()

    print("Enter Year:")
    var n:Float= readln().toFloat()

    println("Simple Interest is ->${(p*r*n)/100}")
}