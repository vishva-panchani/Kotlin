package org.example

fun main() {
    print("Enter Number:")
    val no= readln().toInt()

    var fact=1
    var i=1
    while (i<=no)
    {
        fact *= i
        i++
    }
    print("The Factorial is:-->$fact")



    }


