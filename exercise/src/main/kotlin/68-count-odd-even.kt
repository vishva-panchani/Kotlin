package org.example

fun main() {
    print("Enter a Number:-")
    var no= readln().toInt()

    var temp=no
    var rem=0
    var odd=0
    var even=0
    while (temp>0)
    {
        rem=temp%10
        temp/=10
        if(rem%2==0)
        {
            even++
        }
        else
        {
            odd++
        }

    }
    println("The No is:->$no")
    println("The Total Even No:-> $even")
    println("The Total Odd No:-> $odd")

}