package org.example

fun main() {
    print("Enter Number:-")
    var no= readln().toInt()
    var temp=no
    var count=0
    while (temp>0)
    {
        temp%10
        temp/=10
        count++
    }
    println("The Number is:->$no")
    println("Total Digit:->$count")
}