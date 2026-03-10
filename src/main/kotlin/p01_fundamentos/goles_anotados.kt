package org.example.p01_fundamentos

fun main() {
    var contador = 1
    var goleadores = 0
    var noGoleadores = 0
    while (contador <= 4) {
        print("¿Cuántos goles anotaste? ")
        val goles = readln().toInt()
        if (goles >= 2) {
            goleadores++
        } else {
            noGoleadores++
        }
        contador++
    }
    println()
    println("$goleadores jugadores con dos goles o mas")
    println("$noGoleadores jugadores con menos de dos goles")
}