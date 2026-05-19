package org.example.p06_archivos

import java.io.File

fun main() {
    print("Dame nombre de archivo a abrir: ")
    val nombreArchivo = readln()

    val archivo = File(nombreArchivo)

    // Verificar si el archivo existe
    if (archivo.exists()) {
        println("El archivo existe")
    } else {
        println("El archivo no existe")
        archivo.createNewFile()
        println("Archivo $archivo creado")
    }
}