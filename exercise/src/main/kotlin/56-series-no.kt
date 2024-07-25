package org.example

fun main() {
    print("Enter Number:-")
    var no= readln().toInt()

    var i=1
    while (i<=no)
    {
        print("1/$i,")
        i++
    }
}