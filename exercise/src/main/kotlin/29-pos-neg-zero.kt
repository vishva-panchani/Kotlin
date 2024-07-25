package org.example

fun main() {
    print("Enter any Number:")
    var no= readln().toInt()
    if(no>0)
    {
        println("$no is Positive")
    }
    else if (no<0)
    {
        println("$no is Negative")
    }
    else
    {
        println("It is Zero")
    }
}