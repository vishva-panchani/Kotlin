package org.example

fun main() {
  //  for (i in 1..5)
//    {
//        for (j in 2..i)
//        {
//            print("$")
//        }
//        for (k in i..5)
//        {
//            print(k)
//        }
//        println()
//    }
    for (i in 1..5)
    {
        for(j in 1..5)
        {
            if(i>j)
            {
                print("$")
            }else
            {
                print(j)
            }
        }
        println()
    }
}