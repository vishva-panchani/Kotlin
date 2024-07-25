package org.example

fun main() {

    print("Enter no:-")
    var no= readln().toInt()
    var i=1
    while (i<no)
    {
        if (i%4==0)
        {
            i++
        }
        print(" $i ")
        i++
    }
}