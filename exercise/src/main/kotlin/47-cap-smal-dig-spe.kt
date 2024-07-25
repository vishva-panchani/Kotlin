package org.example

fun main() {
    print("Enter any Character:")
    var ch= readln()
    if(ch>="A"&& ch<="Z")
    {

        println("It Is a Capital Letter")
    }
    else if(ch>="a"&& ch<="z")
    {

        println("It Is a Small Letter")
    }
    else if (ch.toIntOrNull()!=null)
    {
        println("It Is a Digit")
    }
    else
    {
        println("It Is a Special Character")
    }
}