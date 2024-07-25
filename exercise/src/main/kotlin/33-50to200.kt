package org.example

fun main() {
    print("Enter a Number:-")
    var no= readln().toInt()
    if(no in 200 downTo  50)
    {
        println("The No. $no is between 50 to 200")
    }
    else
    {
        println("The No. $no is not between 50 to 200")
    }
}