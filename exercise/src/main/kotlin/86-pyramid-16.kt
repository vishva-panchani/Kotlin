package org.example

fun main() {
    var alpha='A'
    for (i in 1..5)
    {
        for (j in 1..i)
        {
            print(" $alpha")
            alpha++
        }
        println()
    }
}