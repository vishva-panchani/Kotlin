package org.example

fun main() {
    print("Enter The Year:")
    var year= readln().toInt()
    if ((year % 4==0)&&(year % 100!=0))
    {
        println("$year is Leap Year")
    }
    else
    {
        println("$year is not Leap Year")
    }
}