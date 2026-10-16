package p06_archivos

// EscribirArchivo4Amigos

import java.io.File

fun main() {
    val archivo = File("amigos4.txt")

    val salidaArchivo = listOf(
        "Rox",
        "Isaac",
        "Carolina",
        "Ami"
    )
    archivo.writeText(salidaArchivo.joinToString("\n"))
    println("El archivo amigos4.txt ha sido escrito correctamente")
}