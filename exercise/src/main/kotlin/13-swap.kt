package org.example

fun main() {
    print("Enter First No:")
    var no1:Int= readln().toInt()
    print("Enter Second No:")
    var no2:Int= readln().toInt()

    println("Before Swapping No1->$no1")
    println("Before Swapping No2->$no2")
    var temp:Int=0

    temp=no1
    no1=no2
    no2=temp

    println("After swapping No1->$no1")
    println("After swapping No2->$no2")
}