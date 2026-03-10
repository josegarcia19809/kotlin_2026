package org.example.p01_fundamentos

fun main() {
    var contador = 1
    var estudiantesRedes = 0
    while (contador <= 4) {
        println("-".repeat(100))
        println("¿Cuál es tu materia favorita #$contador?")
        println("seguridad")
        println("sistemas")
        println("redes")
        print("Elige: ")
        val materia = readln().lowercase()
        if (materia == "redes") {
            estudiantesRedes++
        }
        contador++
    }

    println("$estudiantesRedes eligieron redes")
}