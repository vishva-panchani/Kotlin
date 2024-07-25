package org.example

fun main() {
    print("Enter Number:-")
    var no= readln().toInt()

    var count=0
    for (i in 1..no)
    {
        if(no%i==0)
        {
            count++
        }
    }
    if (count==2)
    {
        print("$no is a Prime Number")
    }
    else
    {
        print("$no is  Not a Prime Number")
    }
}