package org.example

fun main() {
    print("Ënter a Number:")
    var day= readln().toInt()

    when(day)
    {
        1-> print("January")
        2-> print("February")
        3-> print("March")
        4-> print("April")
        5-> print("May")
        6-> print("June")
        7-> print("July")
        8-> print("August")
        9-> print("September")
        10-> print("October")
        11-> print("November")
        12-> print("December")
        else-> print("Invalid input")

    }
}