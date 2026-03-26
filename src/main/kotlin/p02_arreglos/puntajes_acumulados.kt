package org.example.p02_arreglos

fun main() {
    println("Puntajes acumulados y nivel del jugador ♠️♥️")
    var sumaTotal = 0
    val puntajes = IntArray(9)
    println("Puntuaciones")
    for (i in 0..8) {
        print("#${i + 1}: ")
        puntajes[i] = readln().toInt()
        sumaTotal = sumaTotal + puntajes[i]
    }

    println("Suma total: $sumaTotal")
    if (sumaTotal < 500) {
        println("Nivel principiante")
    } else if (sumaTotal <= 1000) {
        println("Nivel intermedio")
    } else {
        println("Nivel avanzado")
    }

    for (puntaje in puntajes) {
        print("$puntaje \t")
    }
}