package org.example.p06_archivos

import java.io.File

fun main(args: Array<String>) {

    println("📘 Programa para leer un archivo de texto")

    val archivo = File("amigos_202.txt")

    if (archivo.exists()) {

        println("\n📄 Contenido del archivo:\n")

        archivo.reader().forEachLine { linea ->
            println("➡️ $linea")
        }

    } else {

        println("❌ El archivo no existe")
    }

    println("\n✅ Fin del programa")
}