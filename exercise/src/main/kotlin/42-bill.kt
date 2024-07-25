package org.example

fun main() {
    print("Enter your Amount :- ")
    var amt= readln().toInt()

    if(amt in 1..5000)
    {
        var disc=(amt*7.5)/100
        println("Your Total Bill:$amt")
        println("Your Discount :$disc")
        println("Your Net Payable Bill:${amt-disc}")
    }
    else if (amt >5000)
    {
        var disc=(amt*11)/100
        println("Your Total Bill:$amt")
        println("Your Discount :$disc")
        println("Your Net Payable Bill:${amt-disc}")
    }

}