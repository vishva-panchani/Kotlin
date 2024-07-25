package org.example

fun main() {
    print("Enter Number:-")
    var no= readln().toInt()

    var i=1
    while (i<=no)
    {
        print("$i/${i+1},")
        i++
    }
}