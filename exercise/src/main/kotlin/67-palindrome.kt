package org.example

fun main() {
    print("Enter a Number:->")
    var no= readln().toInt()
    var temp=no
    var rem=0
    var rev=0

    while (temp>0)
    {
        rem=temp%10
        temp/=10
        rev=(rev*10)+rem
    }
    if (no==rev)
    {
        println("The $no is Palindrome")
    }
    else
    {
        println("The $no is not Palindrome")
    }
}