package org.example

fun main() {
    print("Enter a Number:-")
    var no= readln().toInt()

    var temp=no
    var rev=0
    var rem=0

    while (temp>0)
    {
        rem=temp%10
        temp /= 10
        rev=(rev*10)+rem
    }
    println("The Reverse Number is:->$rev")
}