package org.example.p11_listas

fun main() {
    val temperaturas = mutableListOf(32, 28, 31, 27, 35, 29, 33)

    val temperaturasMayorIgual30 = mutableListOf<Int>()
    val temperaturasMenor30 = mutableListOf<Int>()

    for (temperatura in temperaturas) {
        if (temperatura >= 30) {
            temperaturasMayorIgual30.add(temperatura)
        } // Falta
    }

    println(temperaturasMayorIgual30)
    println("Dias calurosos: ${temperaturasMayorIgual30.size}")
}