package org.example

fun main() {
    for (i in 1..5)
    {
        for (j in 1..5)
        {
            if (i<j)
            {
                print("$")
            }
            else
            {
                print(i)
            }
        }
        println()
    }
}