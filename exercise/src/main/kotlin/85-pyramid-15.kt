package org.example

fun main() {

    for (i in 1..5)
    {
        for (j in 1.. i)
        {
            if(j % 2 ==0)
            {
                print("0")

            }
            else
            {
                print("1")
            }
        }
        println()
    }
}