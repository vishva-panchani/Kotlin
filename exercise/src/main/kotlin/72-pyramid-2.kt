package org.example

fun main() {
    for(i in 1..5)
    {
        for (j in 1 ..5)
        {
            print( j * i )
        }
        println( "  ")
    }
}