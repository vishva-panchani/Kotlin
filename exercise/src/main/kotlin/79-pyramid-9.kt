package org.example

fun main() {
//    for (i in 1..5)
//    {
//        for (j in 1..i)
//        {
//            print(i)
//        }
//        println()
//    }
    for(i in 1..5)
    {
        for(j in 1..5)
        {
            if(i>=j)

            {
                print(" $i")
            }else
            {
                print(" ")
            }
        }
        println()
    }
}