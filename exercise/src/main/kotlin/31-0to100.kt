package org.example

fun main() {
    print("Enter any Number:")
    var no= readln().toInt()

    if(no in 1..99)
    {
        println("The Number $no is between to 0 to 100")
    }
    else
    {
        println("The Number $no is not  between to 0 to 100")
    }
}