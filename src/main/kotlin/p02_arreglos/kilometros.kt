package org.example.p02_arreglos

fun main() {
    val kilometros = FloatArray(4)
    kilometros[0] = 1.5f
    kilometros[1] = 1.6f
    kilometros[2] = 1.7f
    kilometros[3] = 1.8f
    for (kilometro in kilometros) {
        println(kilometro)
    }
}