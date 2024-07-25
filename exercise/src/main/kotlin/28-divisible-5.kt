package org.example

fun main() {
    print("Enter any Number:")
    var no= readln().toInt()
    if(no%5==0)
    {
        println("$no is divisible by 5 ")
    }
    else
    {
        println("$no is not divisible by 5 ")
    }
}