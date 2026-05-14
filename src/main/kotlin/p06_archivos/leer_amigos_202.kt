package org.example.p06_archivos

import java.io.File

fun main() {
    val archivo = File("amigos_202.txt")

    // Leer el archivo línea por línea
    val lineas = archivo.readLines()

    // Imprimir cada línea
    for (linea in lineas) {
        println("Amigo $linea 😀")
    }
}