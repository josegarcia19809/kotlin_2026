package org.example.p01_fundamentos


fun main(args: Array<String>) {

    println("📘 Programa para convertir texto a número")

    print("✏️ Ingresa un número entero: ")
    val texto = readln()

    val resultado = obtenerNumero(texto)

    if (resultado != null) {
        println("✅ El número convertido es: $resultado")
    } else {
        println("❌ No se pudo convertir el texto a número")
    }

    println("\n📌 Ahora probaremos una función no implementada")

    try {
        noImplementadoAun("Ejemplo")
    } catch (e: IllegalArgumentException) {
        println("⚠️ Error capturado: ${e.message}")
    }
}

fun noImplementadoAun(algo: String): Nothing {
    throw IllegalArgumentException("❌ Esta función aún no está implementada")
}

fun obtenerNumero(texto: String): Int? {

    return try {

        println("🔄 Intentando convertir el texto...")

        Integer.parseInt(texto)

    } catch (e: NumberFormatException) {

        println("⚠️ Ocurrió un error al convertir")

        null

    } finally {

        println("📦 Estoy dentro del bloque finally")
    }
}