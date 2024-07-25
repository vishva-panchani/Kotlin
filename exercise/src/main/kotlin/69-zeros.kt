package org.example

fun main() {
    print("Enter Number:")
    var no = readln().toInt()

    var temp = no
    var rem = 0
    var count = 0
    while (temp > 0) {
        rem = temp % 10
        temp /= 10
        if (rem == 0) {
            count++
        }
    }
    println("The No is:->$no")
    println("The Total Zero:->$count")
}