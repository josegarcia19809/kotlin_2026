package org.example.p02_arreglos

fun main() {
    // Declarar el arreglo de tipo entero de tamaño 8
    val temperaturas = IntArray(8)

    // Acumulador, empieza en cero
    var total = 0

    for (i in temperaturas.indices) {
        print("Dame la temperatura ${i + 1}: ")
        temperaturas[i] = readln().toInt()

        total += temperaturas[i]
    }

    // Variable double para calcular el promedio
    val promedio: Double = total / 8.0
    println("La suma es $total")
    println("El promedio es $promedio")

    // for mejorado
    println("Las temperaturas ingresadas son: ")
    for (temperatura in temperaturas) {
        print("$temperatura ")
    }
    println()
}
