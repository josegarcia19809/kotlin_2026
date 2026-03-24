package org.example.p02_arreglos

fun main() {
    val letras = CharArray(10)
    for (i in 0..9) {
        letras[i] = 'A'

    }
    for (letra in letras) {
        println(letra)
    }
}