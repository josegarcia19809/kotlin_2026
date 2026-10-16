package p06_archivos

// LeerArchivo4Amigos

import java.io.File

fun main() {
    val archivo = File("amigos4.txt")

    // Leer el archivo línea por línea
    val lineas = archivo.readLines()

    // Imprimir cada línea
    for (linea in lineas) {
        println(linea)
    }
}