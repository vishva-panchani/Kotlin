package org.example

fun main() {
    print("Enter Any String:")
    var str= readln().toString()
//    var lst=str.lowercase()
    if (str == "a" || str=="e" || str=="i" ||str=="o" ||str=="u" ||
        str == "A" || str=="E" || str=="I" ||str=="O" ||str=="U")
    {
        print("Vowels")
    }else
    {
        println("Consonants")
    }
}
