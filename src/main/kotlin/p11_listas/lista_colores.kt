package org.example.p11_listas

fun main() {
    val colores = mutableListOf("Rojo", "Azul", "Verde")

    // Imprimir cada color en un renglón diferente
    for (color in colores) {
        println(color)
    }
    println("-".repeat(100))

    for (i in 0..<colores.size) {
        println(colores[i])
    }

}