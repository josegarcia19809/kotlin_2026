package org.example.p02_arreglos

fun main() {
    val numeros: Array<Int> = Array(6) { 0 }
    numeros[0] = 20
    numeros[3] = 30
    for (i in 0..5) {
        print(" ${numeros[i]}")
    }
}