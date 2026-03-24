package org.example.p02_arreglos

fun main() {
    println("🚗 Costo de renta de autos")

    val clientes = 3
    val diasRenta = IntArray(clientes)

    for (i in 0 until clientes) {
        print("Ingresa los días de renta para el cliente ${i + 1}: ")
        diasRenta[i] = readln().toInt()
    }
    println()
    print("Dame el costo de renta por día: ")
    val costo = readln().toDouble()

    println("-".repeat(100))
    for (i in 0 until clientes) {
        val pagoTotal = diasRenta[i] * costo
        println("El cliente ${i + 1} deberá pagar $pagoTotal pesos")
    }
}