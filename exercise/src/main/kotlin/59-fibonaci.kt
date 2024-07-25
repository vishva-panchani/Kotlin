package org.example

fun main() {
    print("Enter Number:-")
    var no= readln().toInt()

    var i=0
    var j=1

    print("$i ")
    print("$j")
    var m=0
    for (n in 1..no)
    {
        m=i+j
        print(" $m")
        i=j
        j=m
    }
}