package org.example

fun main() {
    print("Enter First No1:-")
    var no1:Int= readln().toInt()

    print("Enter Second No2:-")
    var no2:Int= readln().toInt()

    println("Before Swapping No1->$no1")
    println("Before Swapping No2->$no2")

    no1=no1+no2
    no2=no1-no2
    no1=no1-no2

    println("After Swapping No1->$no1")
    println("After Swapping No2->$no2")
}