package org.example.p02_arreglos

fun main() {
    println("Temperaturas ☀️💨🌧️")
    val temperaturas = IntArray(8)
    var sumaTotal = 0

    // Pedir las temperaturas
    for (i in 0..7) {
        print("Ingrese las temperaturas ${i + 1}: ")
        temperaturas[i] = readln().toInt()
        sumaTotal = sumaTotal + temperaturas[i]
    }

    println("-".repeat(100))
    println("Suma total: $sumaTotal")

    val promedio = sumaTotal / 8.0
    println("El promedio es: $promedio")

    for (temperatura in temperaturas) {
        print("$temperatura \t")
    }
}