package org.example.p02_arreglos

fun main() {
    val edades = arrayOf(18, 20, 22, 19)
    // for mejorado
    for (edad in edades) {
        println(edad)
    }
    println("-".repeat(100))
    // for con índices
    for (i in 0..3) {
        println(edades[i])
    }

    // Imprimir la segunda edad
    println(edades[1])

    // Imprimir la edad en la posición 10
    println(edades[10])
}