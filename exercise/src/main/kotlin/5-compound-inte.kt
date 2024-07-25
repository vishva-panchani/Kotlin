package org.example

fun main() {
    print("Enter Principal Amt:")
    var p:Double= readln().toDouble()

    print("Enter Rate of Interest:")
    var r:Double= readln().toDouble()

    print("Enter Year:")
    var n:Double= readln().toDouble()

    var inte=Math.pow((1+(r/100)),n)
    println("Compound Interest ->${p*inte}")
}