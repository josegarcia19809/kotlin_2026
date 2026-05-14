package org.example.p06_archivos

import java.io.DataInputStream
import java.io.EOFException
import java.io.FileInputStream

fun main(args: Array<String>) {

    println("📘 Programa para leer un archivo binario")

    val entradaDatos = DataInputStream(
        FileInputStream("testfile.bin")
    )

    var texto: String

    try {

        println("\n📄 Contenido del archivo binario:\n")

        while (true) {

            texto = entradaDatos.readUTF()

            println("➡️ $texto")
        }

    } catch (e: EOFException) {

        println("\n✅ Fin del archivo alcanzado")

    } finally {

        entradaDatos.close()

        println("📦 Flujo de datos cerrado")
    }
}