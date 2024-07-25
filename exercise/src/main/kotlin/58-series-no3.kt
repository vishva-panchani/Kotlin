package org.example

fun main() {
    print("Enter Number:- ")
    var no= readln().toInt()

    var i=1
    while (i<=no)
    {
        print("${i*i}")
        if (i % 2 ==0)
        {
            print("-")
        }else
        {
            print("+")
        }
        i++
    }
}