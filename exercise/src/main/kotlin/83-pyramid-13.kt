package org.example

fun main() {
    var no=1
    for (i in 1 ..5)
    {
        for (j in 1..i)
        {
            print(" $no")
            no++
        }
        println()
    }
}