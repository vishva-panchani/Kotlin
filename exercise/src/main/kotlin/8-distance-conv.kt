package org.example

fun main() {
    print("Enter Distance between two Cities in KM:")
    var dis:Float= readln().toFloat()

    println("The Distance in Meter->${dis*1000} Meter")
    println("The Distance in Centimeter->${dis*100000} CentiMeter")
    println("The Distance in Feet->${dis*3280.84} Feet")
    println("The Distance in Inch->${dis*39370.1} inch")
}
