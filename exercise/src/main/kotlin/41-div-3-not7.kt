package org.example

fun main() {
    print("Enter a Number:-")
    var  no= readln().toInt()

    if(no%3==0 && no%7!=0)
    {
        println("The Number $no is divisible by 3 and not divisible by 7")
    }
    else
    {
       println("Not Divisible")
    }
}