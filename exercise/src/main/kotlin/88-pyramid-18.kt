package org.example

fun main() {
    for (i in 4 downTo 0)
    {
        for (j in 5 downTo 5-i)
        {
            print(" *")
        }
        println()
    }
}