package org.example

fun main() {
    print("Enter a Starting Number:")
    var no1= readln().toInt()

    print("Enter a Ending Number:")
    var no2= readln().toInt()
    var flag=false
    for (i in no1..no2)
    {
        flag=true
        for(j in 2 until i)
        {
            if(i%j==0)
            {
                flag=false
                break
            }
        }
        if(flag)
        {
            print("$i ")
        }
    }

}