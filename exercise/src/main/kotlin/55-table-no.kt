package org.example

fun main() {
    print("Enter Number:-")
    var no= readln().toInt()

    if(no>0)
    {
        for (i in 1..10)
        {
            println("$no x $i = ${no*i}")
        }
    }
}