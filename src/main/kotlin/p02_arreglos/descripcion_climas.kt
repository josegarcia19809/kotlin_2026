package org.example.p02_arreglos

fun main() {
    println("Temperaturas semanales en texto ☀️🌧️")

    val climas = Array(7) { "" }
    for (i in 0..6) {
        print("Dame la descripción del clima ${i + 1}: ")
        climas[i] = readln()
    }

    println()
    for (clima in climas) {
        print("$clima \t")
    }

    println()
    println("Total de descripciones: ${climas.size}")
}