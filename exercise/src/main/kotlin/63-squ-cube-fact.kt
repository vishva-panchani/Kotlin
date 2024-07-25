package org.example

fun main() {
    for (i in 1..10)
    {
        println("Square of $i is :->${i*i}")
        println("Cube of $i is:-> ${i*i*i}")
        print("Factor of $i is:->")
        for (j in 1..i)
        {
            if(i%j==0)
            {
                print("$j")
            }
        }
        println()
    }
}