package org.example

fun main() {
    print("Ënter a Number:")
    var day= readln().toInt()

    when(day)
    {
        1-> print("Monday")
        2-> print("Tuesday")
        3-> print("Wednesday")
        4-> print("Thursday")
        5-> print("Friday")
        6-> print("Saturday")
        7-> print("Sunday")
        else-> print("Invalid input")

    }
}