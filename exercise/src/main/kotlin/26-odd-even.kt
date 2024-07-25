package org.example

fun main() {
    print("Enter Number:-")
    var no= readln().toInt()
    if(no%2==0)
    {
        println("$no is Even Number")
    }
    else
    {
        println("$no is Odd Number")
    }
}