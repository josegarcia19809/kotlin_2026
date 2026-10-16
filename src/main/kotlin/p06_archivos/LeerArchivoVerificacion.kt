package p06_archivos

// LeerArchivoVerificacion

import java.io.File

fun main() {
    // Pedir el nombre del archivo a abrir
    print("Dame el nombre del archivo: ")
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