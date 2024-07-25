package org.example

fun main() {
    print("Enter 1st Number:")
    var no1= readln().toFloat()
    print("Enter 2nd Number:")
    var no2= readln().toFloat()
    if (no1>no2)
    {
        println("$no1 is Maximum Number")
        println("$no2 is Minimum Number")
    }
    else if (no1<no2)
    {
        println("$no2 is Maximum Number")
        println ("$no1 is Minimum Number")
    }
    else
    {
        print("The Numbers are equal")

    }
}