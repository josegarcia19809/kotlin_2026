package p06_archivos

// EscribirArchivoSaludo

import java.io.File

fun main() {
    // Ruta del archivo
    val archivo = File("saludo.txt")

    // Texto a escribir en el archivo
    val texto = "Saludos desde México 🇲🇽"

    // Escribimos texto en el archivo
    archivo.writeText(texto)

    // Retroalimentación al usuario
    println("El archivo ha sido escrito correctamente")
    
}