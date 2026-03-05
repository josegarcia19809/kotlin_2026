package org.example.p01_fundamentos

fun main() {
    val piezasHora: Int = 120

    print("¿Cuántas horas 🕢 trabajó la máquina? ")
    val horasTrabajadas: Int = readln().toInt()

    val totalPiezas: Int = piezasHora * horasTrabajadas

    if (totalPiezas < 1000) {
        println("Producción normal 😁")
    } else {
        println("Producción alta 🥰")
    }

    println("Total de piezas producidas: $totalPiezas")
}