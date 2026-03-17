package org.example.p02_arreglos

fun main() {
    // Crear una lista de países
    val paises = arrayOf("Argentina", "México", "Estados Unidos", "Canadá", "España", "Francia")

    // Imprimir un elemento por línea
    for (pais in paises) {
        println(pais)
    }

    println()
    //Acceso a países por su índice
    println(paises[0])
    println(paises[1])
    println(paises[2])
    println(paises[3])
    println(paises[4])
    println(paises[5])

    println()
    println("Número de países en la lista: ${paises.size}")

    // Cambiar el elemento en el índice 3
    paises[3] = "Brasil"

    // Imprimir el arreglo
    println(paises.contentToString())
}