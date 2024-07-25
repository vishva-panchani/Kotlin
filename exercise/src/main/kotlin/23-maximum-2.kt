package org.example

fun main() {
    print("Enter 1st Number:")
    var no1= readln().toFloat()
    print("Enter 2nd Number:")
    var no2= readln().toFloat()
    if (no1>no2)
    {
        print("$no1 is Maximum Number")
    }
    else if (no2>no1)
    {
        print("$no2 is Maximum Number")
    }
    else
    {
        print("The Numbers are equal")
    }
}