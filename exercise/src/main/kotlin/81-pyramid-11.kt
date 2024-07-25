package org.example

fun main() {
//    for (i in 5 downTo 1)
//    {
//        for (j in 5 downTo i)
//        {
//            print("$j")
//        }
//        println()
//    }
    for(i in 5 downTo 1)
    {
        for(j in 5 downTo  1)
        {
            if(j>=i)

            {
                print(" $j")
            }else
            {
                print(" ")
            }
        }
        println()
    }
}