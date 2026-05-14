package org.example.p06_archivos

import java.io.File

fun main() {
    val archivo = File("amigos_202.txt")
    val salidaArchivo = listOf(
        "Rox",
        "Isaac",
        "Carolina",
        "Ami"
    )

    archivo.writeText(salidaArchivo.joinToString("\n"))
    println("El archivo amigos_202.txt se ha creado")
}