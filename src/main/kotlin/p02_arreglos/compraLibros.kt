package org.example.p02_arreglos

fun main() {
    println("📚 Compra de libros en una librería")

    val estudiantes = 6
    val librosComprados = IntArray(estudiantes)

    for (i in 0 until estudiantes) {
        print("Cuantos libros desea comprar el estudiante ${i + 1}: ")
        librosComprados[i] = readln().toInt()
    }
    println()
    print("Dame el precio del libro: ")
    val precio = readln().toDouble()
    println("-".repeat(100))

    for (i in 0 until estudiantes) {
        val pagoTotal = librosComprados[i] * precio
        println("El estudiante ${i + 1} debe pagar $pagoTotal pesos")
    }
}