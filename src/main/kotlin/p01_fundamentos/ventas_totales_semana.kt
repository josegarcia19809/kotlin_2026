package org.example.p01_fundamentos

fun main() {
    println("Total de ventas semanales 🏪📆")

    var totalVentas = 0.0

    // Leer las ventas de cada día y acumular el total
    for (dia in 1..5) {
        print("Ingresa las ventas del día $dia: ")
        val ventas = readln().toDouble()
        totalVentas += ventas
    }

    println("Total de ventas $%.2f".format(totalVentas))
}