package org.example.p06_archivos

import java.io.DataOutputStream
import java.io.FileOutputStream

fun main() {

    val salida = DataOutputStream(
        FileOutputStream("testfile.bin")
    )

    salida.writeUTF("Juan")
    salida.writeUTF("María")
    salida.writeUTF("Carlos")

    salida.close()

    println("✅ Datos guardados")
}