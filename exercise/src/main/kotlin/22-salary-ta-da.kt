package org.example

fun main() {
    print("Enter Your Salary: ")
    var sal = readln().toFloat()

    var ta = (sal * 4) / 100
    var da = (sal * 30) / 100
    var hra = (sal * 15) / 100
    var tax = (sal * 3) / 100
    var pf = (sal * 12) / 100
    var netSal=((sal+ta+da+hra)-tax-pf)

    println("TA->$ta")
    println("DA->$da")
    println("HRA->$hra")
    println("TAX->$tax")
    println("PF->$pf")
    println("The Net Salary ->$netSal")
}