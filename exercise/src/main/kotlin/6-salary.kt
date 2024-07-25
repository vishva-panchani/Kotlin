package org.example

fun main() {
    print("Enter Your Salary:")
    var salary:Int= readln().toInt()
    var bonus=(salary*10)/100

    println("Your bonus is->$bonus")
    println("your Total Salary is ->${salary+bonus}")
}