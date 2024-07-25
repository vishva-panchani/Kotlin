package org.example

fun main() {
    print("Enter ASP Mark:-")
    var asp = readln().toInt()
    print("Enter Android Mark:-")
    var android = readln().toInt()
    print("Enter Java Mark:-")
    var java = readln().toInt()
    print("Enter Python Mark:-")
    var python = readln().toInt()
    print("Enter DBMS Mark:-")
    var dbms = readln().toInt()
    var total = (asp + android + java + python + dbms)
    var per = (total * 100 / 500)

    println("Your Total Marks:-$total")
    println("Your Percentage :-$per %")

    val grade = when {
        per >= 90 -> "A+"
        per >= 80 -> "A"
        per >= 70 -> "B"
        per >= 60 -> "C"
        per >= 50 -> "D"
        else -> "Fail"

    }
    println("Your Grade:-$grade")
}