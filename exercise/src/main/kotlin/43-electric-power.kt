package org.example

fun main() {
    print("Enter Your data of power Consumed:")
    var power= readln().toFloat()

    if (power>0 && power<=200)
    {
        println(" Per Unit Rs.:-0.50")
        println("You have to pay:${power*0.50} Rs.")
    }
    else if (power>200 && power<=400)
    {
        println(" Per Unit Rs.:-100.65")
        println("You have to pay:${power*(100+0.65)} Rs.")
    }
    else if (power>400 && power<=600)
    {
        println(" Per Unit Rs.:-230.85")
        println("You have to pay:${power*(230+0.85)} Rs.")
    }
    else if (power>600)
    {
        println(" Per Unit Rs.:-391")
        println("You have to pay:${power*(391)} Rs.")
    }
    else
    {
        println("Invalid Input")
    }
}