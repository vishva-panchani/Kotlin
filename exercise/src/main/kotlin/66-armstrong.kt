package org.example

fun main() {
    print("Enter a Number:-")
    var no= readln().toInt()
    var temp=no
    var rem=0
    var arm=0

    while (temp>0)
    {
        rem=temp%10
        temp/=10
        arm+=(rem*rem*rem)
    }
    if (no==arm)
    {
        println("The $no is Armstrong Number")
    }
    else
    {
        println("The $no is not Armstrong Number")
    }
}