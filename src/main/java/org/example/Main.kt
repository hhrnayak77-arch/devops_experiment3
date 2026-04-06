package org.example

fun addNumber(num1: Double, num2: Double): Double{
    return num1 + num2
}

fun main() {
    val num1 = 10.0
    val num2 = 5.0
    val result=addNumber(num1,num2)
    println("The sum of $num1 and $num2is: $result")
}