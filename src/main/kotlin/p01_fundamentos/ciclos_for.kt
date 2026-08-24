package org.example.p01_fundamentos

fun main() {
    println("Números del 1 al 10")
    for (i in 1..10) {
        println(i)
    }
    println("-".repeat(100))


    println("Saludar 10 veces")
    for (i in 1..10) {
        println("#$i: Hello how are you?")
    }
    println("-".repeat(100))

    println("Tablas de multiplicar del 2")
    for (i in 1..12) {
        println("2 x $i = ${i * 2}")
    }
    println("-".repeat(100))

    println("Mensaje no dormir")
    print("¿Cuántas líneas quieres imprimir? ")
    val n = readln().toInt()

    print("\n")
    for (i in 1..n) {
        println("$i. I must not sleep in class")
    }
    println("-".repeat(100))

    println("Suma de números")
    var total = 0
    for (i in 1..4) {
        total += i
    }
    println("Total: $total")
    println("-".repeat(100))
}